package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Ranks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RanksRepository extends CrudRepository<Ranks, Long> {
}
