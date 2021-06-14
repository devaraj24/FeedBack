package com.cg.spr.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.spr.exception.DoctorNotFoundException;
import com.cg.spr.exception.FeedbackNotFoundException;




@ControllerAdvice
public class ValidationAndExceptionHandler extends ResponseEntityExceptionHandler {

 

    @ExceptionHandler(value = FeedbackNotFoundException.class)
    public ResponseEntity<Object> exception(FeedbackNotFoundException exception) {

 

        return new ResponseEntity<>("Feedback Not Found with this id!!", HttpStatus.NOT_FOUND);
    }
    

    @ExceptionHandler(value = DoctorNotFoundException.class)
    public ResponseEntity<Object> exception(DoctorNotFoundException exception) {

 

        return new ResponseEntity<>("Feedback Not Found with this doctor id!!", HttpStatus.NOT_FOUND);
    }



    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatus status, WebRequest request) {

 

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String message = error.getDefaultMessage();
            errors.put(fieldName, message);
        });

 
        System.out.println(errors);
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}