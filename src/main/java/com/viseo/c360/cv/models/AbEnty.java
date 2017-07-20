package com.viseo.c360.cv.models;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public class AbEnty implements Serializable{

    @Id
    @Column
    @GeneratedValue
    private int id;

    @Version
    long version;


    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public AbEnty() {
        super();
    }
}
