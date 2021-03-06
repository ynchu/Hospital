package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Examinationbill;
import org.nchu.hospital.entity.Medicinebill;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Collection;

@Repository
public interface MedicinebillRepository extends CrudRepository<Medicinebill, Long> {

    @Query("select * from medicinebill where reg_id = :condition")
    public Collection<Medicinebill> findByRegId(@Param("condition") long id);

    @Modifying
    @Query("insert into medicinebill values (:id, :regId, :edate);")
    Boolean insert(@Param("id") int id,
                   @Param("regId") int regId,
                   @Param("edate") Date edate);
}
