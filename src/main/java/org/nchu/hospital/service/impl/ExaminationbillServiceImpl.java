package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Examinationbill;
import org.nchu.hospital.repository.ExaminationbillRepository;
import org.nchu.hospital.service.ExaminationbillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ExaminationbillServiceImpl implements ExaminationbillService {
    @Autowired
    private ExaminationbillRepository examinationbillRepository;


    @Override
    public Optional<Examinationbill> getExabById(long id) {
        return examinationbillRepository.findById(id);
    }

    @Override
    public Collection<Examinationbill> getExabByReg(long reg) {
        return examinationbillRepository.findByRegId(reg);
    }

    @Override
    public Examinationbill createExab(Examinationbill exab) {
        return examinationbillRepository.save(exab);
    }

    @Override
    public boolean createExabs(Examinationbill exab) {
        return examinationbillRepository.insert(
                (int)exab.getId(),
                (int)exab.getRegId(),
                exab.getEdate()
        );
    }
}
