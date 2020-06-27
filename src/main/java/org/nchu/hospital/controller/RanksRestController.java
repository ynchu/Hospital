package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Ranks;
import org.nchu.hospital.service.RanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/ranks")
public class RanksRestController {
    @Autowired
    private RanksService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Ranks>> getRanks(String id) {
        System.out.println("查询");
        Optional<Ranks> ranks = Optional.empty();
        if (id != null) {
            ranks = service.getRankNameById(Long.parseLong(id));
        }
        return new ResponseEntity<>(ranks, HttpStatus.OK);
    }
}
