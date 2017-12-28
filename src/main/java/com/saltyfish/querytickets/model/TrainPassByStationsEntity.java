package com.saltyfish.querytickets.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@javax.persistence.Table(name = "trainPassByStations", schema = "trainServer", catalog = "")
public class TrainPassByStationsEntity {
    private Integer id;

    @Id
    @javax.persistence.Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String trainNumber;

    @Basic
    @javax.persistence.Column(name = "trainNumber")
    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    private Integer stationId;

    @Basic
    @javax.persistence.Column(name = "stationId")
    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    private Date time;

    @Basic
    @javax.persistence.Column(name = "time")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    private Integer type;

    @Basic
    @javax.persistence.Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    private Double money;

    @Basic
    @javax.persistence.Column(name = "money")
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    private Double distance;

    @Basic
    @javax.persistence.Column(name = "distance")
    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrainPassByStationsEntity that = (TrainPassByStationsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (trainNumber != null ? !trainNumber.equals(that.trainNumber) : that.trainNumber != null) return false;
        if (stationId != null ? !stationId.equals(that.stationId) : that.stationId != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (distance != null ? !distance.equals(that.distance) : that.distance != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (trainNumber != null ? trainNumber.hashCode() : 0);
        result = 31 * result + (stationId != null ? stationId.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TrainPassByStationsEntity{" +
                "id=" + id +
                ", trainNumber='" + trainNumber + '\'' +
                ", stationId=" + stationId +
                ", time=" + time +
                ", type=" + type +
                ", money=" + money +
                ", distance=" + distance +
                '}';
    }
}
