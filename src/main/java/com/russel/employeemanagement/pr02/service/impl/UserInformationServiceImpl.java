package com.russel.employeemanagement.pr02.service.impl;

import com.russel.employeemanagement.pr01.model.User;
import com.russel.employeemanagement.pr01.service.UserService;
import com.russel.employeemanagement.pr02.model.UserInformation;
import com.russel.employeemanagement.pr02.respository.UserInformationRepository;
import com.russel.employeemanagement.pr02.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInformationServiceImpl implements UserInformationService {

    @Autowired
    private UserInformationRepository userInformationRepository;

    @Override
    public List<UserInformation> getAllData() {
        return userInformationRepository.findAll();
    }

    @Override
    public ResponseEntity<String> save(UserInformation userInformation) {

        try{
            userInformationRepository.save(userInformation);
            return new ResponseEntity<String>("User Information successfully saved", HttpStatus.OK);

        }catch (DataAccessException dataAccessException){

            return new ResponseEntity<String>("User Information Already Exist",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<String> update(UserInformation userInformation) {

        try{
            boolean userInformationExist=false;

            userInformationExist= userInformationRepository.findAll().stream().filter(userInformationFetch -> userInformationFetch.getUser().getEmail().equalsIgnoreCase(userInformation.getUser().getEmail())).count()<=1;

            if(userInformationExist==true){

                UserInformation userInformationData= (UserInformation) userInformationRepository.findAll().stream().filter(
                        userInformation1 -> userInformation1.getUser().getEmail().equalsIgnoreCase(userInformation.getUser().getEmail()));

                userInformationData.setLastName(userInformation.getLastName());
                userInformationData.setFirstName(userInformation.getLastName());

                userInformationRepository.save(userInformationData);


                return new ResponseEntity<String>("User successfully saved",HttpStatus.OK);
            }
            else{
                return new ResponseEntity<String>("EMAIL NOT FOUND",HttpStatus.BAD_REQUEST);

            }

        }catch (DataAccessException dataAccessException){

            return new ResponseEntity<String>("USER NOT EXIST",HttpStatus.BAD_REQUEST);
        }

    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
