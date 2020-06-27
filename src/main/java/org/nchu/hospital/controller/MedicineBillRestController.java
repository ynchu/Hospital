package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Examinationbill;
import org.nchu.hospital.entity.Medicinebill;
import org.nchu.hospital.service.MedicinebillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/mb")
public class MedicineBillRestController {
    @Autowired
    MedicinebillService medicinebillService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Medicinebill>> getExabById(String id) {
        Optional<Medicinebill> mb = Optional.empty();
        if (id != null) {
            mb = medicinebillService.getMbById(Long.parseLong(id));
        }
        return new ResponseEntity<>(mb, HttpStatus.OK);
    }

    @RequestMapping(value = "/reg", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Medicinebill>> findExabByReg(String id){
        Collection<Medicinebill> mb =null;
        if (id != null) {
            mb = medicinebillService.getMbByReg(Long.parseLong(id));
        }
        return new ResponseEntity<Collection<Medicinebill>>(mb, HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
    public Boolean update(@RequestBody Medicinebill mb) {
        System.out.println("修改");
        Medicinebill exa = medicinebillService.createMb(mb);
        return exa != null;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json")
    public Boolean save(@RequestBody Medicinebill mb) {
        System.out.println("插入");
        //Medicinebill exa = medicinebillService.createMb(mb);
        return medicinebillService.createMbs(mb);
    }

}
