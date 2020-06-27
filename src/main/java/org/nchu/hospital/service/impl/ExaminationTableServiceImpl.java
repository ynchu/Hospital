package org.nchu.hospital.service.impl;


import org.nchu.hospital.entity.Examinationtable;
import org.nchu.hospital.repository.ExaminationtableRepository;
import org.nchu.hospital.service.ExaminationTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExaminationTableServiceImpl implements ExaminationTableService {
    @Autowired
    private ExaminationtableRepository examinationtableRepository;
    @Override
    public Examinationtable createExat(Examinationtable exat) {

        return examinationtableRepository.save(exat);
    }

    @Override
    public Optional<Examinationtable> getExatByExab(long id) {

        return examinationtableRepository.findById(id);
    }
}
