package com.saltyfish.querytickets.model;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class TrainPassByStationsEntity {

    private int id;
    private TrainEntity train;
    private TrainStationEntity station;
    private Timestamp time;
    private Integer type;
    private Integer money;
    private Double distance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TrainEntity getTrain() {
        return train;
    }

    public void setTrain(TrainEntity train) {
        this.train = train;
    }

    public TrainStationEntity getStation() {
        return station;
    }

    public void setStation(TrainStationEntity station) {
        this.station = station;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "TrainPassByStationsEntity{" +
                "id=" + id +
                ", train=" + train +
                ", station=" + station +
                ", time=" + time +
                ", type=" + type +
                ", money=" + money +
                ", distance=" + distance +
                '}';
    }
}
