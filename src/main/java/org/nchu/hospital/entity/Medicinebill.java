package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("medicinebill")
public class Medicinebill {
    @Id
    private long id;
    private long regId;
    private java.sql.Date mbdate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getRegId() {
        return regId;
    }

    public void setRegId(long regId) {
        this.regId = regId;
    }


    public java.sql.Date getMbdate() {
        return mbdate;
    }

    public void setMbdate(java.sql.Date mbdate) {
        this.mbdate = mbdate;
    }

}
