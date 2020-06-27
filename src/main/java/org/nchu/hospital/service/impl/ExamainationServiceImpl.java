package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Examination;
import org.nchu.hospital.entity.Examinationbill;
import org.nchu.hospital.repository.ExaminationRepository;
import org.nchu.hospital.repository.ExaminationbillRepository;
import org.nchu.hospital.service.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ExamainationServiceImpl implements ExaminationService {
    @Autowired
    private ExaminationRepository examinationRepository;

    @Override
    public Optional<Examination> getExaById(long id) {
        return examinationRepository.findById(id);
    }

    @Override
    public Collection<Examination> getExaByDep(long depId) {
        return examinationRepository.findByDepId(depId);
    }
}
