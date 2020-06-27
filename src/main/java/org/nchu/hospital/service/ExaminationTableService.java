package org.nchu.hospital.service;

import org.nchu.hospital.entity.Examinationtable;

import java.util.Collection;

public interface ExaminationTableService {
    public boolean createExat(Examinationtable exat);

    public Collection<Examinationtable> getExatByExab(int id);

}
