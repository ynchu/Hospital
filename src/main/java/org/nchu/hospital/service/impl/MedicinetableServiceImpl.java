package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Medicinetable;
import org.nchu.hospital.repository.MedicinetableRepository;
import org.nchu.hospital.service.MedicinetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicinetableServiceImpl implements MedicinetableService {
    @Autowired
    private MedicinetableRepository repository;

    @Override
    public Medicinetable createMt(Medicinetable medicinetable) {
        return repository.save(medicinetable);
    }

    @Override
    public Boolean intsert(Medicinetable medicinetable) {
        return repository.insert((int) medicinetable.getId(),
                (int) medicinetable.getMedId(),
                (int) medicinetable.getMedId2(),
                (int) medicinetable.getCount());
    }

    @Override
    public Optional<Medicinetable> getMtByMb(long id) {
        return repository.findById(id);
    }
}
