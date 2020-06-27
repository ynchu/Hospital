package org.nchu.hospital.service;

import org.nchu.hospital.entity.Medicinebill;

import java.util.Collection;
import java.util.Optional;

public interface MedicinebillService {
    public Medicinebill createMb(Medicinebill medicinebill);

    public boolean createMbs(Medicinebill medicinebill);

    public Collection<Medicinebill> getMbByReg(long reg);

    public Optional<Medicinebill> getMbById(long id);

}
