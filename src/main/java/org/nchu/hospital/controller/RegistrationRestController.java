package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Registration;
import org.nchu.hospital.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/registration")
public class RegistrationRestController {
    @Autowired
    private RegistrationService service;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Registration>> getRegistrationById(String id) {
        System.out.println("查询");
        Optional<Registration> departments = Optional.empty();
        if (id != null) {
            departments = service.getRegById(Long.parseLong(id));
        }
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
    public Boolean update(@RequestBody Registration registration) {
        System.out.println("修改");
        Registration reg = service.createReg(registration);
        return reg != null;
    }
}
