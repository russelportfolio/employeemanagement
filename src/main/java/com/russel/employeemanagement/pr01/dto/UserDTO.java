package com.russel.employeemanagement.pr01.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDTO {

    @NotNull
    @Email(message = "Email should be valid")
    private String email;

    @Size(min = 9, max = 25, message = "Password should be 9 - 25 character")
    private String password;


    public String getEmail() {
        return email;
    }

    public void setEmail( String email) {
        this.email = email;
    }

    public  String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
