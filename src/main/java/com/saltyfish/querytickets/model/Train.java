package com.saltyfish.querytickets.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Train {

    private String number;
    private String start;
    private String end;
    private Integer specialSeat;
    private Integer firstSeat;
    private Integer secondSeat;
    private Integer softSeat;
    private Integer hardSeat;
    private Integer noSeat;
    private Integer highSleeper;
    private Integer softSleeper;
    private Integer hardSleeper;
    private Double money;
    private Date timeDifference;
    private Date startTime;
    private Date endTime;
    private Integer startType;
    private Integer endType;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getTimeDifference() {
        return timeDifference;
    }

    public void setTimeDifference(Date timeDifference) {
        this.timeDifference = timeDifference;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStartType() {
        return startType;
    }

    public void setStartType(Integer startType) {
        this.startType = startType;
    }

    public Integer getEndType() {
        return endType;
    }

    public void setEndType(Integer endType) {
        this.endType = endType;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number='" + number + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", specialSeat=" + specialSeat +
                ", firstSeat=" + firstSeat +
                ", secondSeat=" + secondSeat +
                ", softSeat=" + softSeat +
                ", hardSeat=" + hardSeat +
                ", noSeat=" + noSeat +
                ", highSleeper=" + highSleeper +
                ", softSleeper=" + softSleeper +
                ", hardSleeper=" + hardSleeper +
                ", money=" + money +
                ", timeDifference=" + timeDifference +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", startType=" + startType +
                ", endType=" + endType +
                '}';
    }
}
