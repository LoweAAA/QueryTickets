package com.saltyfish.querytickets.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="normalQuery",catalog = "trainServer")
public class NormalQueryEntity implements Serializable {

    private static final long serialVersionUID = -7644680486096931393L;
    private NormalQueryEntityId id;

    public NormalQueryEntity() {
    }

    public NormalQueryEntity(NormalQueryEntityId id) {
        this.id = id;
    }

    @EmbeddedId

    @AttributeOverrides({@AttributeOverride(name = "number", column = @Column(name = "number")),
            @AttributeOverride(name = "time", column = @Column(name = "time")),
            @AttributeOverride(name = "station", column = @Column(name = "station")),
            @AttributeOverride(name = "type", column = @Column(name = "type")),
            @AttributeOverride(name = "money", column = @Column (name = "money")),
            @AttributeOverride(name = "specialSeat", column = @Column(name = "specialSeat")),
            @AttributeOverride(name = "firstSeat", column = @Column(name = "firstSeat")),
            @AttributeOverride(name = "secondSeat", column = @Column(name = "secondSeat")),
            @AttributeOverride(name = "softSeat", column = @Column(name = "softSeat")),
            @AttributeOverride(name = "hardSeat", column = @Column(name = "hardSeat")),
            @AttributeOverride(name = "noSeat", column = @Column(name = "noSeat")),
            @AttributeOverride(name = "highSleeper", column = @Column(name = "highSleeper")),
            @AttributeOverride(name = "softSleeper", column = @Column(name = "softSleeper")),
            @AttributeOverride(name = "hardSleeper", column = @Column(name = "hardSleeper")),
            @AttributeOverride(name = "distance", column = @Column(name = "distance"))})
    public NormalQueryEntityId getId() {
        return this.id;
    }

    public void setId(NormalQueryEntityId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NormalQueryEntity{" +
                "id=" + id +
                '}';
    }
}
