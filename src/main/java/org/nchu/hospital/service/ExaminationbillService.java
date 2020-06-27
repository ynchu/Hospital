package org.nchu.hospital.service;

import org.nchu.hospital.entity.Examinationbill;

import java.util.Collection;
import java.util.Optional;

public interface ExaminationbillService {
    public Optional<Examinationbill> getExabById(long id);

    public Collection<Examinationbill> getExabByReg(long reg);

    public Examinationbill createExab(Examinationbill exab);

    public boolean createExabs(Examinationbill exab);

}
