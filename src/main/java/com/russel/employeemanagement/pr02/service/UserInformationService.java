package com.russel.employeemanagement.pr02.service;


import com.russel.employeemanagement.pr02.model.UserInformation;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserInformationService {

    public List<UserInformation> getAllData();
    public ResponseEntity<String> save(UserInformation userInformation);
    public ResponseEntity<String> update(UserInformation userInformation);
    public boolean delete(int id);
}
