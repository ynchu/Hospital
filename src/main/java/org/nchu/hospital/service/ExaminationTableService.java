package org.nchu.hospital.service;

import org.nchu.hospital.entity.Examinationtable;

import java.util.Optional;

public interface ExaminationTableService {
    public Examinationtable createExat(Examinationtable exat);

    public Optional<Examinationtable> getExatByExab(long id);

}
