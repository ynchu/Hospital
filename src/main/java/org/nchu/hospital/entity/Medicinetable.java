package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("medicinetable")
public class Medicinetable {
  @Id
  private long id;
  private long medId;
  private long medId2;
  private long count;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getMedId() {
    return medId;
  }

  public void setMedId(long medId) {
    this.medId = medId;
  }


  public long getMedId2() {
    return medId2;
  }

  public void setMedId2(long medId2) {
    this.medId2 = medId2;
  }


  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

}
