package com.russel.employeemanagement.pr05.respository;

import com.russel.employeemanagement.pr05.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Integer> {
}
