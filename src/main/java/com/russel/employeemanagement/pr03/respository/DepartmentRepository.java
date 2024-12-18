package com.russel.employeemanagement.pr03.respository;

import com.russel.employeemanagement.pr03.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
