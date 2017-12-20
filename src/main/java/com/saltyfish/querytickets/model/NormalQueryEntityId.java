package com.saltyfish.querytickets.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Timestamp;

@Embeddable
public class NormalQueryEntityId implements Serializable {


    private static final long serialVersionUID = -902035079933778172L;

    private String number;
    private Timestamp time;
    private String station;
    private Integer type;
    private Integer money;
    private Integer specialSeat;
    private Integer firstSeat;
    private Integer secondSeat;
    private Integer softSeat;
    private Integer hardSeat;
    private Integer noSeat;
    private Integer highSleeper;
    private Integer softSleeper;
    private Integer hardSleeper;
    private Double distance;

    public NormalQueryEntityId() {
    }

    public NormalQueryEntityId(String number, Timestamp time, String station, Integer type, Integer money, Integer specialSeat,
                               Integer firstSeat, Integer secondSeat, Integer softSeat, Integer hardSeat, Integer noSeat, Integer highSleeper,
                               Integer softSleeper, Integer hardSleeper, Double distance) {
        this.number = number;
        this.time = time;
        this.station = station;
        this.type = type;
        this.money = money;
        this.specialSeat = specialSeat;
        this.firstSeat = firstSeat;
        this.secondSeat = secondSeat;
        this.softSeat = softSeat;
        this.hardSeat = hardSeat;
        this.noSeat = noSeat;
        this.highSleeper = highSleeper;
        this.softSleeper = softSleeper;
        this.hardSleeper = hardSleeper;
        this.distance = distance;
    }

    @Column(name = "number", nullable = true, length = 255)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Column(name = "time", nullable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Column(name = "station", nullable = true, length = 255)
    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Column(name = "type", nullable = true)
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Column(name = "money", nullable = true)
    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Column(name = "specialSeat", nullable = true)
    public Integer getSpecialSeat() {
        return specialSeat;
    }

    public void setSpecialSeat(Integer specialSeat) {
        this.specialSeat = specialSeat;
    }

    @Column(name = "firstSeat", nullable = true)
    public Integer getFirstSeat() {
        return firstSeat;
    }

    public void setFirstSeat(Integer firstSeat) {
        this.firstSeat = firstSeat;
    }

    @Column(name = "secondSeat", nullable = true)
    public Integer getSecondSeat() {
        return secondSeat;
    }

    public void setSecondSeat(Integer secondSeat) {
        this.secondSeat = secondSeat;
    }

    @Column(name = "softSeat", nullable = true)
    public Integer getSoftSeat() {
        return softSeat;
    }

    public void setSoftSeat(Integer softSeat) {
        this.softSeat = softSeat;
    }

    @Column(name = "hardSeat", nullable = true)
    public Integer getHardSeat() {
        return hardSeat;
    }

    public void setHardSeat(Integer hardSeat) {
        this.hardSeat = hardSeat;
    }

    @Column(name = "noSeat", nullable = true)
    public Integer getNoSeat() {
        return noSeat;
    }

    public void setNoSeat(Integer noSeat) {
        this.noSeat = noSeat;
    }

    @Column(name = "highSleeper", nullable = true)
    public Integer getHighSleeper() {
        return highSleeper;
    }

    public void setHighSleeper(Integer highSleeper) {
        this.highSleeper = highSleeper;
    }

    @Column(name = "softSleeper", nullable = true)
    public Integer getSoftSleeper() {
        return softSleeper;
    }

    public void setSoftSleeper(Integer softSleeper) {
        this.softSleeper = softSleeper;
    }

    @Column(name = "hardSleeper", nullable = true)
    public Integer getHardSleeper() {
        return hardSleeper;
    }

    public void setHardSleeper(Integer hardSleeper) {
        this.hardSleeper = hardSleeper;
    }

    @Column(name = "distance", nullable = true, precision = 0)
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

        NormalQueryEntityId that = (NormalQueryEntityId) o;

        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (station != null ? !station.equals(that.station) : that.station != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (specialSeat != null ? !specialSeat.equals(that.specialSeat) : that.specialSeat != null) return false;
        if (firstSeat != null ? !firstSeat.equals(that.firstSeat) : that.firstSeat != null) return false;
        if (secondSeat != null ? !secondSeat.equals(that.secondSeat) : that.secondSeat != null) return false;
        if (softSeat != null ? !softSeat.equals(that.softSeat) : that.softSeat != null) return false;
        if (hardSeat != null ? !hardSeat.equals(that.hardSeat) : that.hardSeat != null) return false;
        if (noSeat != null ? !noSeat.equals(that.noSeat) : that.noSeat != null) return false;
        if (highSleeper != null ? !highSleeper.equals(that.highSleeper) : that.highSleeper != null) return false;
        if (softSleeper != null ? !softSleeper.equals(that.softSleeper) : that.softSleeper != null) return false;
        if (hardSleeper != null ? !hardSleeper.equals(that.hardSleeper) : that.hardSleeper != null) return false;
        if (distance != null ? !distance.equals(that.distance) : that.distance != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (station != null ? station.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (specialSeat != null ? specialSeat.hashCode() : 0);
        result = 31 * result + (firstSeat != null ? firstSeat.hashCode() : 0);
        result = 31 * result + (secondSeat != null ? secondSeat.hashCode() : 0);
        result = 31 * result + (softSeat != null ? softSeat.hashCode() : 0);
        result = 31 * result + (hardSeat != null ? hardSeat.hashCode() : 0);
        result = 31 * result + (noSeat != null ? noSeat.hashCode() : 0);
        result = 31 * result + (highSleeper != null ? highSleeper.hashCode() : 0);
        result = 31 * result + (softSleeper != null ? softSleeper.hashCode() : 0);
        result = 31 * result + (hardSleeper != null ? hardSleeper.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NormalQueryEntityId{" +
                "number='" + number + '\'' +
                ", time=" + time +
                ", station='" + station + '\'' +
                ", type=" + type +
                ", money=" + money +
                ", specialSeat=" + specialSeat +
                ", firstSeat=" + firstSeat +
                ", secondSeat=" + secondSeat +
                ", softSeat=" + softSeat +
                ", hardSeat=" + hardSeat +
                ", noSeat=" + noSeat +
                ", highSleeper=" + highSleeper +
                ", softSleeper=" + softSleeper +
                ", hardSleeper=" + hardSleeper +
                ", distance=" + distance +
                '}';
    }
}
