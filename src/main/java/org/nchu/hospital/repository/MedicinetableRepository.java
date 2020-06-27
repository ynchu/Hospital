package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Medicinetable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicinetableRepository extends CrudRepository<Medicinetable, Long> {
}
