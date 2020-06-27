package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("registration")
public class Registration {
    @Id
    private long id;
    private long medId;
    private long docId;
    private java.sql.Date rdate;
    private double cost;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getMedId() {
        return medId;
    }

    public void setMedId(long medId) {
        this.medId = medId;
    }


    public long getDocId() {
        return docId;
    }

    public void setDocId(long docId) {
        this.docId = docId;
    }


    public java.sql.Date getRdate() {
        return rdate;
    }

    public void setRdate(java.sql.Date rdate) {
        this.rdate = rdate;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
