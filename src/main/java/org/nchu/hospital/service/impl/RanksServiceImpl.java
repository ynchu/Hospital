package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Ranks;
import org.nchu.hospital.repository.RanksRepository;
import org.nchu.hospital.service.RanksService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class RanksServiceImpl implements RanksService {
    @Autowired
    private RanksRepository repository;

    @Override
    public Optional<Ranks> getRankNameById(long id) {
        return repository.findById(id);
    }
}
