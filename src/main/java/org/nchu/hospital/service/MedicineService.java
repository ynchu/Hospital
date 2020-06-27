package org.nchu.hospital.service;

import org.nchu.hospital.entity.Medicine;

import java.util.Optional;

public interface MedicineService {
    public Optional<Medicine> getMedById(long id);
}
