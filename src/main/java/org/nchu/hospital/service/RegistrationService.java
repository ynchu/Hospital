package org.nchu.hospital.service;

import org.nchu.hospital.entity.Registration;

import java.util.Collection;
import java.util.Optional;

public interface RegistrationService {
    public Optional<Registration> getRegById(long id);

    public Collection<Registration> getRegByMc(long id);

    public Registration createReg(Registration registration);

}
