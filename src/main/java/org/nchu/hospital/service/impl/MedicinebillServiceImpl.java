package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Medicinebill;
import org.nchu.hospital.repository.MedicinebillRepository;
import org.nchu.hospital.service.MedicinebillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class MedicinebillServiceImpl implements MedicinebillService {
    @Autowired
    private MedicinebillRepository medicinebillRepository;
    @Override
    public Medicinebill createMb(Medicinebill medicinebill) {
        return medicinebillRepository.save(medicinebill);
    }

    @Override
    public boolean createMbs(Medicinebill medicinebill) {
        return medicinebillRepository.insert(
                (int)medicinebill.getId(),
                (int)medicinebill.getRegId(),
                medicinebill.getMbdate()
        );
    }

    @Override
    public Collection<Medicinebill> getMbByReg(long reg) {
        return medicinebillRepository.findByRegId(reg);
    }

    @Override
    public Optional<Medicinebill> getMbById(long id) {
        return medicinebillRepository.findById(id);
    }
}
