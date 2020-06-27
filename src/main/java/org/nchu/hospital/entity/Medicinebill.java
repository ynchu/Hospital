package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Table("medicinebill")
public class Medicinebill {
    @Id
    @Column(value = "id")
    private long id;

    @Column(value = "reg_id")
    private long regId;

    @Column(value = "mbdate")
    private Date mbdate;


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


    public Date getMbdate() {
        return mbdate;
    }

    public void setMbdate(Date mbdate) {
        this.mbdate = mbdate;
    }

}
