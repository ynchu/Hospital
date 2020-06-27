package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Medicine;
import org.nchu.hospital.entity.Registration;
import org.nchu.hospital.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/medicine")
public class MedicineRestController {
    @Autowired
    private MedicineService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Medicine>> getRegistrationById(String id) {
        System.out.println("查询");
        Optional<Medicine> data = Optional.empty();
        if (id != null) {
            data = service.getMedById(Long.parseLong(id));
        }
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
