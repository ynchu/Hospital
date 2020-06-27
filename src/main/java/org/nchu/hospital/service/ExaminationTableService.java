package org.nchu.hospital.service;

import org.nchu.hospital.entity.Examinationtable;

import java.util.Optional;

public interface ExaminationTableService {
    public Boolean createExat(int id, int exa_id, int exa_id2);

    public Optional<Examinationtable> getExatByExab(long id);

}
