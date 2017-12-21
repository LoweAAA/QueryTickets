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
}
