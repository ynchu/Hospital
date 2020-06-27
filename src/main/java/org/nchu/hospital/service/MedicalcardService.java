package org.nchu.hospital.service;

import org.nchu.hospital.entity.Medicalcard;

import java.util.Optional;

public interface MedicalcardService {
    public Optional<Medicalcard> getMcById(long id);

}
