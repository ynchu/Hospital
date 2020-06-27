package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@Component
@Table("examinationbill")
public class Examinationbill {
    @Id
    @Column(value = "id")
    private long id;

    @Column(value = "reg_id")
    private long regId;

    @Column(value = "edate")
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
