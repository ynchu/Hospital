package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Medicinetable;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicinetableRepository extends CrudRepository<Medicinetable, Long> {
    @Modifying
    @Query("insert into medicinetable values (:id, :medId, :medId2, :count);;")
    Boolean insert(@Param("id") int id,
                   @Param("medId") int medId,
                   @Param("medId2") int docId,
                   @Param("count") int count);
}
