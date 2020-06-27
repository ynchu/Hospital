package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Medicalcard;
import org.nchu.hospital.repository.MedicalcardRepository;
import org.nchu.hospital.service.MedicalcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicalcardServiceImpl implements MedicalcardService {
    @Autowired
    private MedicalcardRepository medicalcardRepository;
    @Override
    public Optional<Medicalcard> getMcById(long id) {

        return medicalcardRepository.findById(id);
    }
}
