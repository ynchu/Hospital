package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("Examinationtable")
public class Examinationtable {
    @Id
    private long id;
    private long exaId;
    private long exaId2;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getExaId() {
        return exaId;
    }

    public void setExaId(long exaId) {
        this.exaId = exaId;
    }


    public long getExaId2() {
        return exaId2;
    }

    public void setExaId2(long exaId2) {
        this.exaId2 = exaId2;
    }

}
