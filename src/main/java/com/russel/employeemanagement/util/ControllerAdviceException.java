package com.russel.employeemanagement.util;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice(annotations = RestController.class)
public class ControllerAdviceException {

    public static String globalMessage;

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

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DataAccessException.class)
    public Map<String ,String> handleVDataAccessException(DataAccessException dataAccessException){

        Map<String ,String> errors = new HashMap<>();

        errors.put("error",globalMessage);

        return errors;
    }

   


}
