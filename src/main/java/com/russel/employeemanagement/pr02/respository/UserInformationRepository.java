package com.russel.employeemanagement.pr02.respository;


import com.russel.employeemanagement.pr02.model.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInformationRepository extends JpaRepository<UserInformation,Integer> {

}
