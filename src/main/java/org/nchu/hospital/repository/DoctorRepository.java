package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Doctor;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    @Query("select * from doctor where dep_id = :condition")
    public Doctor findDocByDep(@Param("condition") long depId);

}
