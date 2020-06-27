package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Examination;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminationRepository extends CrudRepository<Examination, Long> {
}
