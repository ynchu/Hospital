package org.nchu.hospital.service.impl;

import org.nchu.hospital.entity.Department;
import org.nchu.hospital.repository.DepartmentRepository;
import org.nchu.hospital.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;



    @Override
    public Optional<Department> getDepartmentById(long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public Department getDepartmentByName(String name) {
        return null;
    }
}
