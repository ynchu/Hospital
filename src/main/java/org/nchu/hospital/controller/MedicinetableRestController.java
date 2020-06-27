package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Medicinetable;
import org.nchu.hospital.service.MedicinetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/medicinetable")
public class MedicinetableRestController {
    @Autowired
    private MedicinetableService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Medicinetable>> getRegistrationById(String id) {
        System.out.println("查询");
        Optional<Medicinetable> data = Optional.empty();
        if (id != null) {
            data = service.getMtByMb(Long.parseLong(id));
        }
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST, produces = "application/json")
    public Boolean insert(@RequestBody Medicinetable medicinetable) {
        System.out.println("修改");
        Medicinetable mt = service.createMt(medicinetable);
        return mt != null;
    }
}
