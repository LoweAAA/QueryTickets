package com.saltyfish.querytickets.model;

import javax.persistence.*;

@Entity
@Table(name = "trainStation", schema = "trainServer", catalog = "")
public class TrainStationEntity {
    private int id;
    private String station;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "station", nullable = true, length = 255)
    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrainStationEntity that = (TrainStationEntity) o;

        if (id != that.id) return false;
        if (station != null ? !station.equals(that.station) : that.station != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (station != null ? station.hashCode() : 0);
        return result;
    }
}
