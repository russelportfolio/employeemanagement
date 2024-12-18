package com.russel.employeemanagement.pr01.service.impl;

import com.russel.employeemanagement.pr01.model.User;
import com.russel.employeemanagement.pr01.respository.UserRepository;
import com.russel.employeemanagement.pr01.service.UserService;
import com.russel.employeemanagement.util.ControllerAdviceException;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllData() {
        return userRepository.findAll();
    }

    @Override
    public String save(User user) {

        userRepository.save(user);
        return "User successfully saved";

    }

    @Override
    public String update(int userId, User user) {

        User userdata = userRepository.findById(userId).orElseThrow();

        userdata.setEmail(user.getEmail());
        userdata.setPassword(user.getPassword());

        userRepository.save(userdata);
        return "User successfully updated";

    }

    @Override
    public String delete(int id) {

        boolean isUserExist = userRepository.findById(id).isPresent();

        userRepository.deleteById(id);
        return "User successfully Deleted";

    }


}
