package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Medicalcard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalcardRepository extends CrudRepository<Medicalcard, Long> {
}
