package com.saltyfish.querytickets.service.serviceimpl;

import com.saltyfish.querytickets.dao.NormalQueryDao;
import com.saltyfish.querytickets.model.ChangeTrain;
import com.saltyfish.querytickets.model.NormalQueryEntity;
import com.saltyfish.querytickets.model.Train;
import com.saltyfish.querytickets.service.NormalQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Service
public class NormalQueryServiceImpl implements NormalQueryService {

    @Autowired
    private NormalQueryDao normalQueryDao;

    DecimalFormat df = new DecimalFormat("#.0");

    private List<Train> queryByStation(String startStation, String endStation) {
        List start = normalQueryDao.queryByStation(startStation);
        List end = normalQueryDao.queryByStation(endStation);
        List<Train> result = new ArrayList<>();
        NormalQueryEntity normalQueryEntity;
        NormalQueryEntity normalQueryEntity1;
        for (int a = start.size() - 1; a > -1; a--) {
            for (int b = end.size() - 1; b > -1; b--) {
                normalQueryEntity = (NormalQueryEntity) start.get(a);
                normalQueryEntity1 = (NormalQueryEntity) end.get(b);
                if (normalQueryEntity.getId().getNumber().equals(normalQueryEntity1.getId().getNumber()) && normalQueryEntity.getId().getTime().getTime() < normalQueryEntity1.getId().getTime().getTime()) {
                    Train train = new Train();
                    train.setNumber(normalQueryEntity.getId().getNumber());
                    train.setFirstSeat(normalQueryEntity.getId().getFirstSeat());
                    train.setHardSeat(normalQueryEntity.getId().getHardSeat());
                    train.setHardSleeper(normalQueryEntity.getId().getHardSleeper());
                    train.setHighSleeper(normalQueryEntity.getId().getHighSleeper());
                    train.setMoney(Double.valueOf(df.format(normalQueryEntity1.getId().getMoney() - normalQueryEntity.getId().getMoney())));
                    train.setNoSeat(normalQueryEntity.getId().getNoSeat());
                    train.setSecondSeat(normalQueryEntity.getId().getSecondSeat());
                    train.setSoftSeat(normalQueryEntity.getId().getSoftSeat());
                    train.setSoftSleeper(normalQueryEntity.getId().getSoftSleeper());
                    train.setSpecialSeat(normalQueryEntity.getId().getSpecialSeat());
                    train.setEnd(endStation);
                    train.setStart(startStation);
                    train.setEndTime(normalQueryEntity1.getId().getTime());
                    train.setStartTime(normalQueryEntity.getId().getTime());
                    train.setStartType(normalQueryEntity.getId().getType());
                    train.setEndType(normalQueryEntity1.getId().getType());
                    train.setDistance(normalQueryEntity1.getId().getDistance() - normalQueryEntity.getId().getDistance());

                    long diff = normalQueryEntity1.getId().getTime().getTime() - normalQueryEntity.getId().getTime().getTime();
                    long nd = 1000 * 24 * 60 * 60;
                    long nh = 1000 * 60 * 60;
                    long hour = diff % nd / nh;
                    long nm = 1000 * 60;
                    long min = diff % nd % nh / nm;
                    String time = hour + ":" + min;
                    try {
                        Date date = new SimpleDateFormat("HH:mm").parse(time);
                        train.setTimeDifference(date);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    result.add(train);
                    break;
                }
            }
        }
        return result;
    }

    private List<String> changeQuery(String startStation, String endStation) {
        List start = normalQueryDao.queryByStation(startStation);
        List end = normalQueryDao.queryByStation(endStation);
        List<String> result = new ArrayList<>();
        for (int a = start.size(); a > 0; a--) {
            NormalQueryEntity startNormalQueryEntity = (NormalQueryEntity) start.get(a - 1);
            for (int b = end.size(); b > 0; b--) {
                NormalQueryEntity endNormalQueryEntity = (NormalQueryEntity) end.get(b - 1);
                if (startNormalQueryEntity.getId().getNumber().equals(endNormalQueryEntity.getId().getNumber())) {
                    continue;
                }
                List train1 = normalQueryDao.queryByNumber(startNormalQueryEntity.getId().getNumber());
                train1.sort((Comparator<NormalQueryEntity>) (o1, o2) -> Integer.compare(o1.getId().getTime().compareTo(o2.getId().getTime()), 0));
                List train2 = normalQueryDao.queryByNumber(endNormalQueryEntity.getId().getNumber());
                train2.sort((Comparator<NormalQueryEntity>) (o1, o2) -> Integer.compare(o1.getId().getTime().compareTo(o2.getId().getTime()), 0));
                int sizeStart = 0;
                for (int c = 0; c < train1.size(); c++) {
                    NormalQueryEntity train = (NormalQueryEntity) train1.get(c);
                    if (train.getId().getStation().equals(startStation)) {
                        sizeStart = c;
                        break;
                    }
                }
                int sizeEnd = 0;
                for (int c = 0; c < train2.size(); c++) {
                    NormalQueryEntity train = (NormalQueryEntity) train2.get(c);
                    if (train.getId().getStation().equals(endStation)) {
                        sizeEnd = c;
                        break;
                    }
                }
                for (int size1 = sizeStart; size1 < train1.size(); size1++) {
                    NormalQueryEntity train3 = (NormalQueryEntity) train1.get(size1);
                    String station3 = train3.getId().getStation();
                    long time1 = train3.getId().getTime().getTime();
                    for (int size2 = sizeEnd; size2 >= 0; size2--) {
                        NormalQueryEntity train4 = (NormalQueryEntity) train2.get(size2);
                        String station4 = train4.getId().getStation();
                        long time2 = train4.getId().getTime().getTime();
                        if (station3.equals(station4) && !station3.equals(startStation) && !station3.equals(endStation) && time1 < time2) {
                            result.add(train3.getId().getStation());
                        }
                    }
                }
            }
        }
        return result;
    }

    public List order(String startStation, String endStation, String type) {
        List<Train> list = queryByStation(startStation, endStation);
        switch (type) {
            case "money":
                list.sort((o1, o2) -> {
                    if (o1.getMoney() > o2.getMoney())
                        return 1;
                    if (o1.getMoney() < o2.getMoney())
                        return -1;
                    else
                        return 0;
                });
                break;
            case "startTime":
                list.sort((o1, o2) -> Integer.compare(o1.getStartTime().compareTo(o2.getStartTime()), 0));
                break;
            case "endTime":
                list.sort((o1, o2) -> Integer.compare(o1.getEndTime().compareTo(o2.getEndTime()), 0));
                break;
            case "timeDifference":
                list.sort((o1, o2) -> Integer.compare(o1.getTimeDifference().compareTo(o2.getTimeDifference()), 0));
        }
        return list;
    }

    @Override
    public List change(String startStation, String endStation) {
        return changeQuery(startStation, endStation);
    }

    @Override
    public List changeTrain(String startStation, String endStation, String changeStation, String order) {
        List list = new ArrayList<>();
        try {
            switch (order) {
                case "money":
                    changeList(startStation, endStation, changeStation, list);
                    list.sort((Comparator<ChangeTrain>) (o1, o2) -> Integer.compare(o1.getSumMoney().compareTo(o2.getSumMoney()), 0));
                    return list;
                case "distance":
                    changeList(startStation, endStation, changeStation, list);
                    list.sort((Comparator<ChangeTrain>) (o1, o2) -> Integer.compare(o1.getSumDistance().compareTo(o2.getSumDistance()), 0));
                    return list;
                default:
                    changeList(startStation, endStation, changeStation, list);
                    list.sort((Comparator<ChangeTrain>) (o1, o2) -> Integer.compare(o1.getSumTime().compareTo(o2.getSumTime()), 0));
                    return list;
            }
        } catch (ParseException e) {
            e.printStackTrace();
            list.add("err");
            return list;
        }
    }

    private void changeList(String startStation, String endStation, String changeStation, List list) throws ParseException {
        if (changeStation.equals("")) {
            List<String> stations = changeQuery(startStation, endStation);
            for (Object object : stations) {
                String station = (String) object;
                List<Train> startTrain = queryByStation(startStation, station);
                List<Train> endTrain = queryByStation(station, endStation);
                changeTrainQuery(station, list, startTrain, endTrain);
            }
        } else {
            List<Train> startTrain = queryByStation(startStation, changeStation);
            List<Train> endTrain = queryByStation(changeStation, endStation);
            changeTrainQuery(changeStation, list, startTrain, endTrain);
        }
    }

    private void changeTrainQuery(String changeStation, List list, List<Train> startTrain, List<Train> endTrain) throws ParseException {
        for (Object aStartTrain : startTrain) {
            Train train1 = (Train) aStartTrain;
            Date startDate = normalQueryDao.queryTime(train1.getNumber(), changeStation);
            for (Object anEndTrain : endTrain) {
                Train train2 = (Train) anEndTrain;
                Date endDate = normalQueryDao.queryTime(train2.getNumber(), changeStation);
                if (startDate.getTime() < endDate.getTime()) {
                    ChangeTrain changeTrain = new ChangeTrain();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                    changeTrain.setFirstNumber(train1.getNumber());
                    changeTrain.setSecondNumber(train2.getNumber());
                    changeTrain.setFirstStart(train1.getStartTime());
                    changeTrain.setFirstEnd(train1.getEndTime());
                    changeTrain.setSecondStart(train2.getStartTime());
                    changeTrain.setSecondEnd(train2.getEndTime());
                    changeTrain.setStartStation(train1.getStart());
                    changeTrain.setStartStationType(train1.getStartType());
                    changeTrain.setChangeStation(train1.getEnd());
                    changeTrain.setFirstChangeType(train1.getEndType());
                    changeTrain.setSecondChangeType(train2.getStartType());
                    changeTrain.setEndStation(train2.getEnd());
                    changeTrain.setEndStationType(train2.getEndType());
                    changeTrain.setFirstTimeDifference(train1.getTimeDifference());
                    changeTrain.setSecondTimeDifference(train2.getTimeDifference());
                    changeTrain.setSumMoney(train1.getMoney() + train2.getMoney());
                    changeTrain.setSumDistance(train1.getDistance() + train2.getDistance());
                    long diff = startDate.getTime() - endDate.getTime();
                    long nd = 1000 * 24 * 60 * 60;
                    long nh = 1000 * 60 * 60;
                    long hour = diff % nd / nh;
                    long nm = 1000 * 60;
                    long min = diff % nd % nh / nm;
                    String time = hour + ":" + min;
                    Date date = simpleDateFormat.parse(time);
                    changeTrain.setSumTime(simpleDateFormat.parse(simpleDateFormat.format(train2.getEndTime().getTime() - train1.getStartTime().getTime())));
                    changeTrain.setDuringTime(date);
                    changeTrain.setFirstFirst(train1.getFirstSeat());
                    changeTrain.setFirstFirstMoney(Double.valueOf(df.format(train1.getMoney() * 1.5)));
                    changeTrain.setFirstSecond(train1.getSecondSeat());
                    changeTrain.setFirstSecondMoney(Double.valueOf(df.format(train1.getMoney())));
                    changeTrain.setFirstBusiness(train1.getSpecialSeat());
                    changeTrain.setFirstBusinessMoney(Double.valueOf(df.format(train1.getMoney() * 1.8)));
                    changeTrain.setSecondFirst(train2.getFirstSeat());
                    changeTrain.setSecondFirstMoney(Double.valueOf(df.format(train2.getMoney() * 1.5)));
                    changeTrain.setSecondSecond(train1.getSecondSeat());
                    changeTrain.setSecondSecondMoney(Double.valueOf(df.format(train2.getMoney())));
                    changeTrain.setSecondBusiness(train2.getSpecialSeat());
                    changeTrain.setSecondBusinessMoney(Double.valueOf(df.format(train2.getMoney() * 1.8)));
                    list.add(changeTrain);
                }
            }
        }
    }
}
