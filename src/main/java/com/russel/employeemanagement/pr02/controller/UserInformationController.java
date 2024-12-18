package com.russel.employeemanagement.pr02.controller;

import com.russel.employeemanagement.pr01.dto.UserDTO;
import com.russel.employeemanagement.pr01.model.User;
import com.russel.employeemanagement.pr01.service.UserService;
import com.russel.employeemanagement.pr02.dto.UserInformationDTO;
import com.russel.employeemanagement.pr02.model.UserInformation;
import com.russel.employeemanagement.pr02.service.UserInformationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/userInformation")
@CrossOrigin
public class UserInformationController {

    @Autowired
    private UserInformationService userInformationService;

    @GetMapping
    public ResponseEntity<List<UserInformation>> getAllUser(){

        return new ResponseEntity<List<UserInformation>>(userInformationService.getAllData(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveUser(@Valid @RequestBody UserInformationDTO userInformationDTO){

        UserInformation userInformation = new UserInformation();

        userInformation.setFirstName(userInformationDTO.getFirstName());
        userInformation.setLastName(userInformationDTO.getLastName());
        userInformation.setUser(userInformationDTO.getUser());


        return userInformationService.save(userInformation);
    }

    @PutMapping
    public ResponseEntity updateUser(@Valid @RequestBody UserInformationDTO userInformationDTO){

        UserInformation userInformation = new UserInformation();

        userInformation.setFirstName(userInformationDTO.getFirstName());
        userInformation.setLastName(userInformationDTO.getLastName());
        userInformation.setUser(userInformationDTO.getUser());

        return userInformationService.update(userInformation);
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String ,String> handleValidateException(MethodArgumentNotValidException methodArgumentNotValidException){

        Map<String ,String> errors = new HashMap<>();

        methodArgumentNotValidException.getBindingResult().getAllErrors().forEach((error)->{

            String fieldName=((FieldError) error).getField();

            String errorMessage=error.getDefaultMessage();

            errors.put(fieldName,errorMessage);

        });

        return errors;
    }
}
