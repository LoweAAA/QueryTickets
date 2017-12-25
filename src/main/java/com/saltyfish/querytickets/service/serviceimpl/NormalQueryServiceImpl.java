package com.saltyfish.querytickets.service.serviceimpl;

import com.saltyfish.querytickets.dao.NormalQueryDao;
import com.saltyfish.querytickets.model.NormalQueryEntity;
import com.saltyfish.querytickets.model.Train;
import com.saltyfish.querytickets.service.NormalQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class NormalQueryServiceImpl implements NormalQueryService {

    @Autowired
    private NormalQueryDao normalQueryDao;

    private List queryByStation(String startStation, String endStation) {
        List start = normalQueryDao.queryByStation(startStation);
        List end = normalQueryDao.queryByStation(endStation);
        List<Train> result = new ArrayList<>();
        NormalQueryEntity normalQueryEntity;
        NormalQueryEntity normalQueryEntity1;
        for (int a = start.size() - 1; a > -1; a--) {
            for (int b = end.size() - 1; b > -1; b--) {
                normalQueryEntity = (NormalQueryEntity) start.get(a);
                normalQueryEntity1 = (NormalQueryEntity) end.get(b);
                if (normalQueryEntity.getId().getNumber().equals(normalQueryEntity1.getId().getNumber()) && normalQueryEntity.getId().getType() <= normalQueryEntity1.getId().getType()) {
                    Train train = new Train();
                    train.setNumber(normalQueryEntity.getId().getNumber());
                    train.setFirstSeat(normalQueryEntity.getId().getFirstSeat());
                    train.setHardSeat(normalQueryEntity.getId().getHardSeat());
                    train.setHardSleeper(normalQueryEntity.getId().getHardSleeper());
                    train.setHighSleeper(normalQueryEntity.getId().getHighSleeper());
                    train.setMoney(normalQueryEntity1.getId().getMoney() - normalQueryEntity.getId().getMoney());
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
                        System.out.println(date);
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

    public List order(String startStation, String endStation, String type) {
        List list = queryByStation(startStation, endStation);
        switch (type) {
            case "money":
                System.out.println("money");
                Collections.sort(list, new Comparator<Train>() {
                    @Override
                    public int compare(Train o1, Train o2) {
                        if (o1.getMoney() > o2.getMoney())
                            return 1;
                        if (o1.getMoney() < o2.getMoney())
                            return -1;
                        else
                            return 0;
                    }
                });
                break;
            case "startTime":
                System.out.println("startTime");
                Collections.sort(list, new Comparator<Train>() {
                    @Override
                    public int compare(Train o1, Train o2) {
                        return Integer.compare(o1.getStartTime().compareTo(o2.getStartTime()), 0);
                    }
                });
                break;
            case "endTime":
                System.out.println("endTime");
                Collections.sort(list, new Comparator<Train>() {
                    @Override
                    public int compare(Train o1, Train o2) {
                        return Integer.compare(o1.getEndTime().compareTo(o2.getEndTime()), 0);
                    }
                });
                break;
            case "timeDifference":
                System.out.println("timeDifference");
                Collections.sort(list, new Comparator<Train>() {
                    @Override
                    public int compare(Train o1, Train o2) {
                        return Integer.compare(o1.getTimeDifference().compareTo(o2.getTimeDifference()), 0);
                    }
                });
        }
        return list;
    }

    /**
     * 未实现！
     *
     * @param startStation
     * @param endStation
     * @return
     */
    @Override
    public List change(String startStation, String endStation) {
        List start = normalQueryDao.queryByStation(startStation);
        List end = normalQueryDao.queryByStation(endStation);
        List<Train> result = new ArrayList<>();
        for (int a = start.size(); a > 0; a--) {
            NormalQueryEntity startNormalQueryEntity = (NormalQueryEntity) start.get(a - 1);
            for (int b = end.size(); b > 0; b--) {
                NormalQueryEntity endNormalQueryEntity = (NormalQueryEntity) end.get(b - 1);
                if (startNormalQueryEntity.getId().getNumber().equals(endNormalQueryEntity.getId().getNumber()))
                    continue;
                List station1 = normalQueryDao.queryByNumber(startNormalQueryEntity.getId().getNumber());
                List station2 = normalQueryDao.queryByNumber(endNormalQueryEntity.getId().getNumber());
                for (int c = station1.size(); c > 0; c--) {
                    for (int d = station2.size(); d > 0; d--) {
                        String station3 = (String) station1.get(c - 1);
                        String station4 = (String) station2.get(d - 1);
                        if (station3.equals(station4)) {
                            Train train = new Train();
                            train.setNumber(startNormalQueryEntity.getId().getNumber());
                            train.setFirstSeat(startNormalQueryEntity.getId().getFirstSeat());
                            train.setHardSeat(startNormalQueryEntity.getId().getHardSeat());
                            train.setHardSleeper(startNormalQueryEntity.getId().getHardSleeper());
                            train.setHighSleeper(startNormalQueryEntity.getId().getHighSleeper());
                            train.setMoney(startNormalQueryEntity.getId().getMoney() - startNormalQueryEntity.getId().getMoney());//
                            train.setNoSeat(startNormalQueryEntity.getId().getNoSeat());
                            train.setSecondSeat(startNormalQueryEntity.getId().getSecondSeat());
                            train.setSoftSeat(startNormalQueryEntity.getId().getSoftSeat());
                            train.setSoftSleeper(startNormalQueryEntity.getId().getSoftSleeper());
                            train.setSpecialSeat(startNormalQueryEntity.getId().getSpecialSeat());
                            train.setEnd(endStation);
                            train.setStart(startStation);
                            train.setEndTime(startNormalQueryEntity.getId().getTime());
                            train.setStartTime(startNormalQueryEntity.getId().getTime());
                            train.setStartType(startNormalQueryEntity.getId().getType());
                            train.setEndType(startNormalQueryEntity.getId().getType());
                        }
                    }
                }
            }
        }
        return null;
    }
}
