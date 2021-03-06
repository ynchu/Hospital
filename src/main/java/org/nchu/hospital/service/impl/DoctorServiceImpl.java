package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Doctor;
import org.nchu.hospital.repository.DoctorRepository;
import org.nchu.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;


    public Optional<Doctor> getDoctorById(long id) {
        return doctorRepository.findById(id);
    }

    @Override
    public Optional<Doctor> getDoctorByName(String name) {
        return null;
    }

    @Override
    public Collection<Doctor> getDoctorByDep(long depId) {
        return doctorRepository.findDocByDep(depId);
    }

    @Override
    public Collection<Doctor> getDoctorByRank(long rankId) {
        return doctorRepository.findDocByRan(rankId);
    }
}
