package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Examinationbill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminationbillRepository extends CrudRepository<Examinationbill, Long> {
}
