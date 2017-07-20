package com.viseo.c360.cv.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ELE3653 on 19/07/2017.
 */

@Entity
@Table
public class LanguagesEntity extends AbEnty {

    @Column
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
