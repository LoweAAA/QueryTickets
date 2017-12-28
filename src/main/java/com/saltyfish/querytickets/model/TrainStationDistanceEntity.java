package com.saltyfish.querytickets.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "trainStationDistance", schema = "trainServer", catalog = "")
@Component
public class TrainStationDistanceEntity {
    private int id;
    private double distance;
    private TrainStationEntity trainStationByStart;
    private TrainStationEntity trainStationByEnd;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Basic
    @Column(name = "distance")
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
                ", distance=" + distance +
                ", trainStationByStart=" + trainStationByStart +
                ", trainStationByEnd=" + trainStationByEnd +
                '}';
    }

    @ManyToOne
    @JoinColumn(name = "start", referencedColumnName = "id", nullable = false)
    public TrainStationEntity getTrainStationByStart() {
        return trainStationByStart;
    }

    public void setTrainStationByStart(TrainStationEntity trainStationByStart) {
        this.trainStationByStart = trainStationByStart;
    }

    @ManyToOne
    @JoinColumn(name = "end", referencedColumnName = "id", nullable = false)
    public TrainStationEntity getTrainStationByEnd() {
        return trainStationByEnd;
    }

    public void setTrainStationByEnd(TrainStationEntity trainStationByEnd) {
        this.trainStationByEnd = trainStationByEnd;
    }
}
