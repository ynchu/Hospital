package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Examination;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ExaminationRepository extends CrudRepository<Examination, Long> {
    @Query("select * from examination where dep_id = :condition")
    public Collection<Examination> findByDepId(@Param("condition") long depId);
}
