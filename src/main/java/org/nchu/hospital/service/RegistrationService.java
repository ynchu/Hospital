package org.nchu.hospital.service;

import org.nchu.hospital.entity.Registration;

import java.util.Collection;

public interface RegistrationService {
    public Registration getRegById(int id);

    public Collection<Registration> getRegByMc(int id);

    public boolean createReg(Registration registration);

}
