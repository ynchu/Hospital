package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Department;
import org.nchu.hospital.entity.Doctor;
import org.nchu.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/doctor")
public class DoctorRestController {
    @Autowired
    DoctorService doctorService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Doctor>> findDocById(String id){
        System.out.println("查询评论");
        Optional<Doctor> doctor = Optional.empty();
        if (id != null) {
            doctor = doctorService.getDoctorById(Long.parseLong(id));
        }
        return new ResponseEntity<>(doctor, HttpStatus.OK);
    }

    @RequestMapping(value = "/dep", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Doctor>> findDocByDepId(String id){
        System.out.println("查询评论");
        Collection<Doctor> doctor =null;
        if (id != null) {
            doctor = doctorService.getDoctorByDep(Long.parseLong(id));
        }
        return new ResponseEntity<Collection<Doctor>>(doctor, HttpStatus.OK);
    }

    @RequestMapping(value = "/ran", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Doctor>> findDocByRanId(String id){
        System.out.println("查询评论");
        Collection<Doctor> doctor =null;
        if (id != null) {
            doctor = doctorService.getDoctorByRank(Long.parseLong(id));
        }
        return new ResponseEntity<Collection<Doctor>>(doctor, HttpStatus.OK);
    }




}
