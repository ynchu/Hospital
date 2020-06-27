package org.nchu.hospital.service;

import org.nchu.hospital.entity.Department;

public interface DepartmentService {
    public Department getDepartmentById(int id);

    public Department getDepartmentByName(String name);

}
