package com.saltyfish.querytickets.model;

import org.springframework.stereotype.Component;

@Component
public class TrainStationDistanceEntity {
    private int id;
    private TrainStationEntity start;
    private TrainStationEntity end;
    private double distance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TrainStationEntity getStart() {
        return start;
    }

    public void setStart(TrainStationEntity start) {
        this.start = start;
    }

    public TrainStationEntity getEnd() {
        return end;
    }

    public void setEnd(TrainStationEntity end) {
        this.end = end;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "TrainStationDistanceEntity{" +
                "id=" + id +
                ", start=" + start +
                ", end=" + end +
                ", distance=" + distance +
                '}';
    }
}
