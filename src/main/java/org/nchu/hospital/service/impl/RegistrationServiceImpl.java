package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Registration;
import org.nchu.hospital.repository.RegistrationRepository;
import org.nchu.hospital.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private RegistrationRepository repository;

    @Override
    public Optional<Registration> getRegById(long id) {
        return repository.findById(id);
    }

    @Override
    public Collection<Registration> getRegByMc(long id) {
        return (Collection<Registration>) repository.findAll();
    }

    @Override
    public Registration createReg(Registration registration) {
        return repository.save(registration);
    }

    @Override
    public Boolean insert(Registration registration) {
        return repository.insert((int) registration.getId(),
                (int) registration.getMedId(),
                (int) registration.getDocId(),
                registration.getRdate(),
                (float) registration.getCost());
    }
}
