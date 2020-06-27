package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Examinationbill;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.Collection;

@Repository
public interface ExaminationbillRepository extends CrudRepository<Examinationbill, Long> {

    @Query("select * from examinationbill where reg_id = :condition")
    public Collection<Examinationbill> findByRegId(@Param("condition") long id);

    @Modifying
    @Query("insert into examinationbill values (:id, :regId, :edate);")
    Boolean insert(@Param("id") int id,
                   @Param("regId") int regId,
                   @Param("edate") Date edate);
}
