package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Medicinebill;
import org.nchu.hospital.repository.MedicinebillRepository;
import org.nchu.hospital.service.MedicinebillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Optional<Medicinebill> getMbByReg(long reg) {
        return medicinebillRepository.findById(reg);
    }
}
