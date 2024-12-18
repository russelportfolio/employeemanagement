package com.russel.employeemanagement.pr03.service;


import com.russel.employeemanagement.pr03.model.Department;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DepartmentService {

    public List<Department> getAllData();
    public ResponseEntity<String> save(Department department);
    public ResponseEntity<String> update(Department department);
    public boolean delete(int id);
}


