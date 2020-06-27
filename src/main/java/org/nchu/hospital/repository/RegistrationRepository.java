package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Registration;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Long> {
    /**
     * 插入方法
     *
     * @param id    id
     * @param medId medId
     * @param docId docId
     * @param rdate rdate
     * @param cost  cost
     * @return Boolean
     */
    @Modifying
    @Query("insert into registration values (:id, :medId, :docId, :rdate, :cost);")
    Boolean insert(@Param("id") int id,
                   @Param("medId") int medId,
                   @Param("docId") int docId,
                   @Param("rdate") Date rdate,
                   @Param("cost") float cost);
}
