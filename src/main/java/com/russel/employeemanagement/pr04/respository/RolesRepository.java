package com.russel.employeemanagement.pr04.respository;

import com.russel.employeemanagement.pr04.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles, Integer> {
}
