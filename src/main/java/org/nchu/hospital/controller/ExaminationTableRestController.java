package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Department;
import org.nchu.hospital.entity.Examinationtable;
import org.nchu.hospital.service.ExaminationTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/ExaminationTable")
public class ExaminationTableRestController {
    @Autowired
    private ExaminationTableService examinationTableService;

    @RequestMapping(value = "/exa", method = RequestMethod.POST, produces = "application/json")
    public Boolean createExat(@RequestBody Examinationtable examinationtable){


        System.out.println(examinationtable);

       int id= (int)examinationtable.getId();
       int exa_id =(int)examinationtable.getExaId();
       int exa_id2 = (int)examinationtable.getExaId2();


        return examinationTableService.createExat(id,exa_id,exa_id2);
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Examinationtable>> getExatByExab(String id){
        System.err.println(id);
        Optional<Examinationtable> examinationtables = Optional.empty();
        if (id != null) {
            examinationtables = examinationTableService.getExatByExab(Long.parseLong(id));
        }
        return new ResponseEntity<>(examinationtables, HttpStatus.OK);
    }
}
