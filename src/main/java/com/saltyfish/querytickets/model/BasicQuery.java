package com.saltyfish.querytickets.model;

import java.util.Date;

public class BasicQuery {

    private String trainNumber;
    private String beginStation;
    private Integer beginType;
    private String finishStation;
    private Integer finishType;
    private Date beginTime;
    private Date finishTime;
    private String lastTime;
    private Integer specialSeat;
    private Integer firstSeat;
    private Integer secondSeat;
    private Integer softSeat;
    private Integer hardSeat;
    private Integer noSeat;
    private Integer highSleeper;
    private Integer softSleeper;
    private Integer hardSleeper;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getBeginStation() {
        return beginStation;
    }

    public void setBeginStation(String beginStation) {
        this.beginStation = beginStation;
    }

    public Integer getBeginType() {
        return beginType;
    }

    public void setBeginType(Integer beginType) {
        this.beginType = beginType;
    }

    public String getFinishStation() {
        return finishStation;
    }

    public void setFinishStation(String finishStation) {
        this.finishStation = finishStation;
    }

    public Integer getFinishType() {
        return finishType;
    }

    public void setFinishType(Integer finishType) {
        this.finishType = finishType;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public Integer getSpecialSeat() {
        return specialSeat;
    }

    public void setSpecialSeat(Integer specialSeat) {
        this.specialSeat = specialSeat;
    }

    public Integer getFirstSeat() {
        return firstSeat;
    }

    public void setFirstSeat(Integer firstSeat) {
        this.firstSeat = firstSeat;
    }

    public Integer getSecondSeat() {
        return secondSeat;
    }

    public void setSecondSeat(Integer secondSeat) {
        this.secondSeat = secondSeat;
    }

    public Integer getSoftSeat() {
        return softSeat;
    }

    public void setSoftSeat(Integer softSeat) {
        this.softSeat = softSeat;
    }

    public Integer getHardSeat() {
        return hardSeat;
    }

    public void setHardSeat(Integer hardSeat) {
        this.hardSeat = hardSeat;
    }

    public Integer getNoSeat() {
        return noSeat;
    }

    public void setNoSeat(Integer noSeat) {
        this.noSeat = noSeat;
    }

    public Integer getHighSleeper() {
        return highSleeper;
    }

    public void setHighSleeper(Integer highSleeper) {
        this.highSleeper = highSleeper;
    }

    public Integer getSoftSleeper() {
        return softSleeper;
    }

    public void setSoftSleeper(Integer softSleeper) {
        this.softSleeper = softSleeper;
    }

    public Integer getHardSleeper() {
        return hardSleeper;
    }

    public void setHardSleeper(Integer hardSleeper) {
        this.hardSleeper = hardSleeper;
    }

    @Override
    public String toString() {
        return "BasicQuery{" +
                "trainNumber='" + trainNumber + '\'' +
                ", beginStation='" + beginStation + '\'' +
                ", beginType=" + beginType +
                ", finishStation='" + finishStation + '\'' +
                ", finishType=" + finishType +
                ", beginTime=" + beginTime +
                ", finishTime=" + finishTime +
                ", lastTime='" + lastTime + '\'' +
                ", specialSeat=" + specialSeat +
                ", firstSeat=" + firstSeat +
                ", secondSeat=" + secondSeat +
                ", softSeat=" + softSeat +
                ", hardSeat=" + hardSeat +
                ", noSeat=" + noSeat +
                ", highSleeper=" + highSleeper +
                ", softSleeper=" + softSleeper +
                ", hardSleeper=" + hardSleeper +
                '}';
    }
}
