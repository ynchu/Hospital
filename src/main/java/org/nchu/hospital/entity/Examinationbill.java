package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("Examinationbill")
public class Examinationbill {
    @Id
    private long id;
    private long regId;
    private java.sql.Date edate;


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


    public java.sql.Date getEdate() {
        return edate;
    }

    public void setEdate(java.sql.Date edate) {
        this.edate = edate;
    }

}
