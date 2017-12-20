package com.saltyfish.querytickets.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "train", schema = "trainServer", catalog = "")
public class TrainEntity {
    private int id;
    private Integer specialSeat;
    private Integer firstSeat;
    private Integer secondSeat;
    private Integer softSeat;
    private Integer hardSeat;
    private Integer noSeat;
    private Integer highSleeper;
    private Integer softSleeper;
    private Integer hardSleeper;
    private String number;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "specialSeat", nullable = true)
    public Integer getSpecialSeat() {
        return specialSeat;
    }

    public void setSpecialSeat(Integer specialSeat) {
        this.specialSeat = specialSeat;
    }

    @Basic
    @Column(name = "firstSeat", nullable = true)
    public Integer getFirstSeat() {
        return firstSeat;
    }

    public void setFirstSeat(Integer firstSeat) {
        this.firstSeat = firstSeat;
    }

    @Basic
    @Column(name = "secondSeat", nullable = true)
    public Integer getSecondSeat() {
        return secondSeat;
    }

    public void setSecondSeat(Integer secondSeat) {
        this.secondSeat = secondSeat;
    }

    @Basic
    @Column(name = "softSeat", nullable = true)
    public Integer getSoftSeat() {
        return softSeat;
    }

    public void setSoftSeat(Integer softSeat) {
        this.softSeat = softSeat;
    }

    @Basic
    @Column(name = "hardSeat", nullable = true)
    public Integer getHardSeat() {
        return hardSeat;
    }

    public void setHardSeat(Integer hardSeat) {
        this.hardSeat = hardSeat;
    }

    @Basic
    @Column(name = "noSeat", nullable = true)
    public Integer getNoSeat() {
        return noSeat;
    }

    public void setNoSeat(Integer noSeat) {
        this.noSeat = noSeat;
    }

    @Basic
    @Column(name = "highSleeper", nullable = true)
    public Integer getHighSleeper() {
        return highSleeper;
    }

    public void setHighSleeper(Integer highSleeper) {
        this.highSleeper = highSleeper;
    }

    @Basic
    @Column(name = "softSleeper", nullable = true)
    public Integer getSoftSleeper() {
        return softSleeper;
    }

    public void setSoftSleeper(Integer softSleeper) {
        this.softSleeper = softSleeper;
    }

    @Basic
    @Column(name = "hardSleeper", nullable = true)
    public Integer getHardSleeper() {
        return hardSleeper;
    }

    public void setHardSleeper(Integer hardSleeper) {
        this.hardSleeper = hardSleeper;
    }

    @Basic
    @Column(name = "number", nullable = true, length = 255)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrainEntity that = (TrainEntity) o;

        if (id != that.id) return false;
        if (specialSeat != null ? !specialSeat.equals(that.specialSeat) : that.specialSeat != null) return false;
        if (firstSeat != null ? !firstSeat.equals(that.firstSeat) : that.firstSeat != null) return false;
        if (secondSeat != null ? !secondSeat.equals(that.secondSeat) : that.secondSeat != null) return false;
        if (softSeat != null ? !softSeat.equals(that.softSeat) : that.softSeat != null) return false;
        if (hardSeat != null ? !hardSeat.equals(that.hardSeat) : that.hardSeat != null) return false;
        if (noSeat != null ? !noSeat.equals(that.noSeat) : that.noSeat != null) return false;
        if (highSleeper != null ? !highSleeper.equals(that.highSleeper) : that.highSleeper != null) return false;
        if (softSleeper != null ? !softSleeper.equals(that.softSleeper) : that.softSleeper != null) return false;
        if (hardSleeper != null ? !hardSleeper.equals(that.hardSleeper) : that.hardSleeper != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (specialSeat != null ? specialSeat.hashCode() : 0);
        result = 31 * result + (firstSeat != null ? firstSeat.hashCode() : 0);
        result = 31 * result + (secondSeat != null ? secondSeat.hashCode() : 0);
        result = 31 * result + (softSeat != null ? softSeat.hashCode() : 0);
        result = 31 * result + (hardSeat != null ? hardSeat.hashCode() : 0);
        result = 31 * result + (noSeat != null ? noSeat.hashCode() : 0);
        result = 31 * result + (highSleeper != null ? highSleeper.hashCode() : 0);
        result = 31 * result + (softSleeper != null ? softSleeper.hashCode() : 0);
        result = 31 * result + (hardSleeper != null ? hardSleeper.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TrainEntity{" +
                "id=" + id +
                ", specialSeat=" + specialSeat +
                ", firstSeat=" + firstSeat +
                ", secondSeat=" + secondSeat +
                ", softSeat=" + softSeat +
                ", hardSeat=" + hardSeat +
                ", noSeat=" + noSeat +
                ", highSleeper=" + highSleeper +
                ", softSleeper=" + softSleeper +
                ", hardSleeper=" + hardSleeper +
                ", number='" + number + '\'' +
                '}';
    }
}
