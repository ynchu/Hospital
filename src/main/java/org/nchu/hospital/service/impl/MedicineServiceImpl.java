package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Medicine;
import org.nchu.hospital.repository.MedicineRepository;
import org.nchu.hospital.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    private MedicineRepository repository;

    @Override
    public Optional<Medicine> getMedById(long id) {
        return repository.findById(id);
    }
}
