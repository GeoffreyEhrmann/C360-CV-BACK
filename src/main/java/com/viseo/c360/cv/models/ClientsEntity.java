package com.viseo.c360.cv.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ELE3653 on 19/07/2017.
 */

@Table
@Entity
public class ClientsEntity extends AbEnty{

    @Column
    private String label;

    @Column
    private String description;

    @OneToMany (mappedBy = "clientId")
    private List <MissionsEntity> mission;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<MissionsEntity> getMission() {
        return mission;
    }

    public void setMission(List<MissionsEntity> mission) {
        this.mission = mission;
    }
}
