package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Examinationtable;
import org.nchu.hospital.entity.Medicalcard;
import org.nchu.hospital.service.MedicalcardService;
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
@RequestMapping(value = "/api/v1/Medicalcard")
public class MedicalcardRestController {
    @Autowired
    private MedicalcardService medicalcardService;
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Medicalcard>>getMcById(String id){
        Optional<Medicalcard> medicalcards = Optional.empty();
        if (id != null) {
            medicalcards = medicalcardService.getMcById(Long.parseLong(id));
        }
        return new ResponseEntity<>(medicalcards, HttpStatus.OK);
    }
}
