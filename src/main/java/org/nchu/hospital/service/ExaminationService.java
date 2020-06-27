package org.nchu.hospital.service;

import org.nchu.hospital.entity.Examination;

import java.util.Collection;
import java.util.Optional;

public interface ExaminationService {
    public Optional<Examination> getExaById(long id);

    public Collection<Examination> getExaByDep(long depId);

}
