package org.nchu.hospital.service;

import org.nchu.hospital.entity.Doctor;

import java.util.Collection;

public interface DoctorService {
    public Doctor getDoctorById(int id);

    public Doctor getDoctorByName(String name);

    public Collection<Doctor> getDoctorByDep(int depId);

    public Collection<Doctor> getDoctorByRank(int rankId);
}
