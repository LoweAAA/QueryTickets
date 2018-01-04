package com.saltyfish.querytickets.model;

import java.util.Date;

public class ChangeTrain {

    private String firstNumber;
    private String secondNumber;
    private Date firstStart;
    private Date firstEnd;
    private Date secondStart;
    private Date secondEnd;
    private String startStation;
    private String changeStation;
    private String endStation;
    private Integer startStationType;
    private Integer firstChangeType;
    private Integer secondChangeType;
    private Integer endStationType;
    private Date firstTimeDifference;
    private Date secondTimeDifference;
    private Date duringTime;
    private Date sumTime;
    private Integer firstFirst;
    private Integer firstSecond;
    private Integer firstBusiness;
    private Integer secondFirst;
    private Integer secondSecond;
    private Integer secondBusiness;
    private Double firstFirstMoney;
    private Double firstSecondMoney;
    private Double firstBusinessMoney;
    private Double secondFirstMoney;
    private Double secondSecondMoney;
    private Double secondBusinessMoney;
    private Double sumDistance;
    private Double sumMoney;

    public Double getSumDistance() {
        return sumDistance;
    }

    public void setSumDistance(Double sumDistance) {
        this.sumDistance = sumDistance;
    }

    public Double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(Double sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
    }

    public Date getFirstStart() {
        return firstStart;
    }

    public void setFirstStart(Date firstStart) {
        this.firstStart = firstStart;
    }

    public Date getFirstEnd() {
        return firstEnd;
    }

    public void setFirstEnd(Date firstEnd) {
        this.firstEnd = firstEnd;
    }

    public Date getSecondStart() {
        return secondStart;
    }

    public void setSecondStart(Date secondStart) {
        this.secondStart = secondStart;
    }

    public Date getSecondEnd() {
        return secondEnd;
    }

    public void setSecondEnd(Date secondEnd) {
        this.secondEnd = secondEnd;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getChangeStation() {
        return changeStation;
    }

    public void setChangeStation(String changeStation) {
        this.changeStation = changeStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public Date getFirstTimeDifference() {
        return firstTimeDifference;
    }

    public void setFirstTimeDifference(Date firstTimeDifference) {
        this.firstTimeDifference = firstTimeDifference;
    }

    public Date getSecondTimeDifference() {
        return secondTimeDifference;
    }

    public void setSecondTimeDifference(Date secondTimeDifference) {
        this.secondTimeDifference = secondTimeDifference;
    }

    public Date getDuringTime() {
        return duringTime;
    }

    public void setDuringTime(Date duringTime) {
        this.duringTime = duringTime;
    }

    public Date getSumTime() {
        return sumTime;
    }

    public void setSumTime(Date sumTime) {
        this.sumTime = sumTime;
    }

    public Integer getFirstFirst() {
        return firstFirst;
    }

    public void setFirstFirst(Integer firstFirst) {
        this.firstFirst = firstFirst;
    }

    public Integer getFirstSecond() {
        return firstSecond;
    }

    public void setFirstSecond(Integer firstSecond) {
        this.firstSecond = firstSecond;
    }

    public Integer getFirstBusiness() {
        return firstBusiness;
    }

    public void setFirstBusiness(Integer firstBusiness) {
        this.firstBusiness = firstBusiness;
    }

    public Integer getSecondFirst() {
        return secondFirst;
    }

    public void setSecondFirst(Integer secondFirst) {
        this.secondFirst = secondFirst;
    }

    public Integer getSecondSecond() {
        return secondSecond;
    }

    public void setSecondSecond(Integer secondSecond) {
        this.secondSecond = secondSecond;
    }

    public Integer getSecondBusiness() {
        return secondBusiness;
    }

    public void setSecondBusiness(Integer secondBusiness) {
        this.secondBusiness = secondBusiness;
    }

    public Double getFirstFirstMoney() {
        return firstFirstMoney;
    }

    public void setFirstFirstMoney(Double firstFirstMoney) {
        this.firstFirstMoney = firstFirstMoney;
    }

    public Double getFirstSecondMoney() {
        return firstSecondMoney;
    }

    public void setFirstSecondMoney(Double firstSecondMoney) {
        this.firstSecondMoney = firstSecondMoney;
    }

    public Double getFirstBusinessMoney() {
        return firstBusinessMoney;
    }

    public void setFirstBusinessMoney(Double firstBusinessMoney) {
        this.firstBusinessMoney = firstBusinessMoney;
    }

    public Double getSecondFirstMoney() {
        return secondFirstMoney;
    }

    public void setSecondFirstMoney(Double secondFirstMoney) {
        this.secondFirstMoney = secondFirstMoney;
    }

    public Double getSecondSecondMoney() {
        return secondSecondMoney;
    }

    public void setSecondSecondMoney(Double secondSecondMoney) {
        this.secondSecondMoney = secondSecondMoney;
    }

    public Double getSecondBusinessMoney() {
        return secondBusinessMoney;
    }

    public void setSecondBusinessMoney(Double secondBusinessMoney) {
        this.secondBusinessMoney = secondBusinessMoney;
    }

    public Integer getStartStationType() {
        return startStationType;
    }

    public void setStartStationType(Integer startStationType) {
        this.startStationType = startStationType;
    }

    public Integer getFirstChangeType() {
        return firstChangeType;
    }

    public void setFirstChangeType(Integer firstChangeType) {
        this.firstChangeType = firstChangeType;
    }

    public Integer getSecondChangeType() {
        return secondChangeType;
    }

    public void setSecondChangeType(Integer secondChangeType) {
        this.secondChangeType = secondChangeType;
    }

    public Integer getEndStationType() {
        return endStationType;
    }

    public void setEndStationType(Integer endStationType) {
        this.endStationType = endStationType;
    }

    @Override
    public String toString() {
        return "ChangeTrain{" +
                "firstNumber='" + firstNumber + '\'' +
                ", secondNumber='" + secondNumber + '\'' +
                ", firstStart=" + firstStart +
                ", firstEnd=" + firstEnd +
                ", secondStart=" + secondStart +
                ", secondEnd=" + secondEnd +
                ", startStation='" + startStation + '\'' +
                ", changeStation='" + changeStation + '\'' +
                ", endStation='" + endStation + '\'' +
                ", startStationType=" + startStationType +
                ", firstChangeType=" + firstChangeType +
                ", secondChangeType=" + secondChangeType +
                ", endStationType=" + endStationType +
                ", firstTimeDifference=" + firstTimeDifference +
                ", secondTimeDifference=" + secondTimeDifference +
                ", duringTime=" + duringTime +
                ", sumTime=" + sumTime +
                ", firstFirst=" + firstFirst +
                ", firstSecond=" + firstSecond +
                ", firstBusiness=" + firstBusiness +
                ", secondFirst=" + secondFirst +
                ", secondSecond=" + secondSecond +
                ", secondBusiness=" + secondBusiness +
                ", firstFirstMoney=" + firstFirstMoney +
                ", firstSecondMoney=" + firstSecondMoney +
                ", firstBusinessMoney=" + firstBusinessMoney +
                ", secondFirstMoney=" + secondFirstMoney +
                ", secondSecondMoney=" + secondSecondMoney +
                ", secondBusinessMoney=" + secondBusinessMoney +
                ", sumDistance=" + sumDistance +
                ", sumMoney=" + sumMoney +
                '}';
    }
}
