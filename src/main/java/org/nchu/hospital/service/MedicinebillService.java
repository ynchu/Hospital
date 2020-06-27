package org.nchu.hospital.service;

import org.nchu.hospital.entity.Medicinebill;

import java.util.Collection;

public interface MedicinebillService {
    public boolean createMb(Medicinebill medicinebill);

    public Collection<Medicinebill> getMbByReg(int reg);

}
