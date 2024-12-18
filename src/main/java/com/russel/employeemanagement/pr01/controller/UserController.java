package com.russel.employeemanagement.pr01.controller;

import com.russel.employeemanagement.pr01.dto.UserDTO;
import com.russel.employeemanagement.pr01.model.User;
import com.russel.employeemanagement.pr01.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController  {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){

        return new ResponseEntity<List<User>>(userService.getAllData(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> saveUser(@Valid @RequestBody UserDTO user){

        User userData = new User();

        userData.setEmail(user.getEmail());
        userData.setPassword(user.getPassword());

        return new ResponseEntity<String>(userService.save(userData),HttpStatus.OK);
    }

    @PutMapping(path = "/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable("userId") int userId  ,@Valid @RequestBody UserDTO user){

        User userData = new User();

        userData.setEmail(user.getEmail());
        userData.setPassword(user.getPassword());

        return new ResponseEntity<String>(userService.update(userId,userData),HttpStatus.OK);
    }

    @DeleteMapping(path = "/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable("userId")  int userId ){

        return new ResponseEntity<String>(userService.delete(userId),HttpStatus.OK);
    }

}
