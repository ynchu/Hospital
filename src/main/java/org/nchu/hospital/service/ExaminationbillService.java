package org.nchu.hospital.service;

import org.nchu.hospital.entity.Examinationbill;

import java.util.Collection;

public interface ExaminationbillService {
    public Examinationbill getExabById(int id);

    public Collection<Examinationbill> getExabByReg(int reg);

    public boolean createExab(Examinationbill exab);

}
