package org.nchu.hospital.service;

import org.nchu.hospital.entity.Medicinetable;

import java.util.Optional;

public interface MedicinetableService {
    public Medicinetable createMt(Medicinetable medicinetable);

    public Optional<Medicinetable> getMtByMb(long id);

}
