package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Department;
import org.nchu.hospital.entity.Doctor;
import org.nchu.hospital.entity.Examinationbill;
import org.nchu.hospital.entity.Registration;
import org.nchu.hospital.service.ExaminationbillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/exab")
public class ExaminationbillRestController {
    @Autowired
    ExaminationbillService examinationbillService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Examinationbill>> getExabById(String id) {
        Optional<Examinationbill> examinationbill = Optional.empty();
        if (id != null) {
            examinationbill = examinationbillService.getExabById(Long.parseLong(id));
        }
        return new ResponseEntity<>(examinationbill, HttpStatus.OK);
    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Examinationbill>> findExabByReg(String id){
        Collection<Examinationbill> exab =null;
        if (id != null) {
            exab = examinationbillService.getExabByReg(Long.parseLong(id));
        }
        return new ResponseEntity<Collection<Examinationbill>>(exab, HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
    public Boolean update(@RequestBody Examinationbill exab) {
        System.out.println("修改");
        Examinationbill exa = examinationbillService.createExab(exab);
        return exa != null;
    }

}
