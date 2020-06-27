package org.nchu.hospital.entity;

public class Examination {

  private long id;
  private long depId;
  private String name;
  private double cost;
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
