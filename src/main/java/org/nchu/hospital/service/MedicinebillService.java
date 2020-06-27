package org.nchu.hospital.service;

import org.nchu.hospital.entity.Medicinebill;

import java.util.Optional;

public interface MedicinebillService {
    public Medicinebill createMb(Medicinebill medicinebill);

    public Optional<Medicinebill> getMbByReg(long reg);

}
