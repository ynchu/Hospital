package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@Component
@Table("medicine")
public class Medicine {
    @Id
    @Column(value = "id")
    private long id;

    @Column(value = "name")
    private String name;

    @Column(value = "producer")
    private String producer;

    @Column(value = "pdate")
    private java.sql.Date pdate;

    @Column(value = "cost")
    private double cost;

    @Column(value = "stock")
    private long stock;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


    public java.sql.Date getPdate() {
        return pdate;
    }

    public void setPdate(java.sql.Date pdate) {
        this.pdate = pdate;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public long getStock() {
        return stock;
    }

    public void setStock(long stock) {
        this.stock = stock;
    }

}
