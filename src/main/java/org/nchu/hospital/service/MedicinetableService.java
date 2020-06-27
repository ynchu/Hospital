package org.nchu.hospital.service;

import org.nchu.hospital.entity.Medicinetable;

import java.util.Collection;

public interface MedicinetableService {
    public boolean createMt(Medicinetable medicinetable);

    public Collection<Medicinetable> getMtByMb(int id);

}
