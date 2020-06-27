package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("Doctor")
public class Doctor {

    @Id
    private long id;
    private long depId;
    private long ranId;
    private String name;
    private long sex;
    private long age;
    private String tel;
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
