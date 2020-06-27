package org.nchu.hospital.service;

import org.nchu.hospital.entity.Department;

import java.util.Optional;

public interface DepartmentService {
    public Optional<Department> getDepartmentById(long id);

    public Department getDepartmentByName(String name);

}
