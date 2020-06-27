package org.nchu.hospital.controller;

import org.nchu.hospital.entity.Department;
import org.nchu.hospital.service.DepartmentService;
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
@RequestMapping(value = "/api/v1/department")
public class DepartmentRestController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Optional<Department>> getAllBookComments(String userId) {
        System.out.println("查询评论");
        Optional<Department> departments = Optional.empty();
        if (userId == null) {
            assert userId != null;
            departments = departmentService.getDepartmentById(Long.parseLong(userId));
        }
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
}
