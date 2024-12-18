package com.russel.employeemanagement.pr01.service;

import com.russel.employeemanagement.pr01.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    public List<User> getAllData();
    public String save(User user);
    public String update(int userId,User user);
    public String delete(int id);
}
