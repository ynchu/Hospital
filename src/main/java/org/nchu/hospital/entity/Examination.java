package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@Component
@Table("examination")
public class Examination {
    @Id
    @Column(value = "id")
    private long id;

    @Column(value = "dep_id")
    private long depId;

    @Column(value = "name")
    private String name;

    @Column(value = "cost")
    private double cost;

    @Column(value = "address")
    private String address;


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


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
