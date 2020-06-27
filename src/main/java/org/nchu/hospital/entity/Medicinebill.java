package org.nchu.hospital.entity;

public class Medicinebill {

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
