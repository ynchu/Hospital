package org.nchu.hospital.service;

import org.nchu.hospital.entity.Ranks;

import java.util.Optional;

public interface RanksService {
    public Optional<Ranks> getRankNameById(long id);
}
