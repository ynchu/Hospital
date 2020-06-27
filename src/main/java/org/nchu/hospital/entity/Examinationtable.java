package org.nchu.hospital.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Component;

@Component
@Table("examinationtable")
public class Examinationtable {
    @Id
    @Column(value = "id")
    private long id;

    @Column(value = "exa_id")
    private long exaId;

    @Column(value = "exa_id2")
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
