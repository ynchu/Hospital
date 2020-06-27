package org.nchu.hospital.repository;

import org.nchu.hospital.entity.Examinationtable;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ExaminationtableRepository extends CrudRepository<Examinationtable, Long> {

    @Modifying
    @Query("insert into Examinationtable values (:id, :exa_id, :exa_id2);")
    Boolean insert(@Param("id") int id,
                            @Param("exa_id") int exa_id,
                            @Param("exa_id2") int exa_id2
    );

}
