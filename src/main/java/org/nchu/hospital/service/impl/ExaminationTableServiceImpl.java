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
    public Boolean createExat(int id, int exa_id, int exa_id2) {

        return examinationtableRepository.insert(id,exa_id,exa_id2);
    }

    @Override
    public Optional<Examinationtable> getExatByExab(long id) {

        return examinationtableRepository.findById(id);
    }
}
