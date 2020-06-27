package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@Component
@Table("doctor")
public class Doctor {
    @Id
    @Column(value = "id")
    private long id;

    @Column(value = "dep_id")
    private long depId;

    @Column(value = "ran_id")
    private long ranId;

    @Column(value = "name")
    private String name;

    @Column(value = "sex")
    private long sex;

    @Column(value = "age")
    private long age;

    @Column(value = "tel")
    private String tel;

    @Column(value = "idnum")
    private String idnum;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getDepId() {
        return depId;
    }

    public void setDepId(long depId) {
        this.depId = depId;
    }


    public long getRanId() {
        return ranId;
    }

    public void setRanId(long ranId) {
        this.ranId = ranId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getSex() {
        return sex;
    }

    public void setSex(long sex) {
        this.sex = sex;
    }


    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }


    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

}
