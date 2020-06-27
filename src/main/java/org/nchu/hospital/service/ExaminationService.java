package org.nchu.hospital.service;

import org.nchu.hospital.entity.Examination;

import java.util.Collection;

public interface ExaminationService {
    public Examination getExaById(int id);

    public Collection<Examination> getExaByDep(int depId);

}
