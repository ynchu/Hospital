package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Doctor;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    @Query("select * from doctor where dep_id = :condition")
    public Collection<Doctor> findDocByDep(@Param("condition") long depId);

    @Query("select * from doctor where ran_id = :condition")
    public Collection<Doctor> findDocByRan(@Param("condition") long ranId);

}
