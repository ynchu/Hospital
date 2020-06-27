package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Examinationbill;
import org.nchu.hospital.entity.Medicinebill;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface MedicinebillRepository extends CrudRepository<Medicinebill, Long> {

    @Query("select * from medicinebill where reg_id = :condition")
    public Collection<Medicinebill> findByRegId(@Param("condition") long id);
}
