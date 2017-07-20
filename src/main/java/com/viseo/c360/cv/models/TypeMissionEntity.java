package com.viseo.c360.cv.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ELE3653 on 19/07/2017.
 */

@Entity
@Table
public class TypeMissionEntity extends AbEnty {

    @Column
    private String label;

    @OneToMany (mappedBy = "typeMissionId")
    private List <MissionsEntity> missions;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


}
