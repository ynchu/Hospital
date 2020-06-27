package org.nchu.hospital.service;

import org.nchu.hospital.entity.Doctor;

import java.util.Collection;
import java.util.Optional;

public interface DoctorService {
    public Optional<Doctor> getDoctorById(long id);

    public Optional<Doctor> getDoctorByName(String name);

    public Collection<Doctor> getDoctorByDep(long depId);

    public Collection<Doctor> getDoctorByRank(long rankId);
}
