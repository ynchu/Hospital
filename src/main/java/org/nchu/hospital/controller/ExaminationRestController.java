package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Department;
import org.nchu.hospital.entity.Examination;
import org.nchu.hospital.service.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/Examination")
public class ExaminationRestController {
    @Autowired
    private ExaminationService examinationService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Examination>> getExaById(String id){
        Optional<Examination> examinations = Optional.empty();
        if (id!=null) {
            examinations = examinationService.getExaById(Long.parseLong(id));

        }
        return  new ResponseEntity<>(examinations, HttpStatus.OK);
    }
    @RequestMapping(value = "/dep", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Examination>> getExaByDep(String id){
        Collection<Examination> examinations = null;
        if (id!=null) {
            examinations = examinationService.getExaByDep(Long.parseLong(id));

        }
        return  new ResponseEntity<>(examinations, HttpStatus.OK);
    }

}
