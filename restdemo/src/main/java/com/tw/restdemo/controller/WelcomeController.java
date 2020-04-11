package com.tw.restdemo.controller;

import com.tw.restdemo.model.user.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

@RestController
public class WelcomeController {


    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to SpringBoot Workshop";
    }

    @GetMapping("/login/{email}")
    public ResponseEntity<RegistrationResponse> welcome(@PathVariable String email) {
        try {
            User user = UserManagement.getUserBy(email);
            RegistrationResponse successResponse = new RegistrationResponse(true,user.getGreetingMessage());
            return new ResponseEntity<RegistrationResponse>(successResponse, HttpStatus.OK);
        } catch (UserNotFoundException ex) {
            RegistrationResponse errorResponse = new RegistrationResponse(false, ex.getMessage());
            return new  ResponseEntity<RegistrationResponse>(errorResponse, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/register")
    public ResponseEntity<RegistrationResponse> register(@Valid @RequestBody User user)  {
        try {
            UserManagement.register(user);
            RegistrationResponse successResponse = new RegistrationResponse(true,"Success");
            return new ResponseEntity<RegistrationResponse>(successResponse, HttpStatus.CREATED);
        } catch (UserAlreadyExistException ex) {
            RegistrationResponse errorResponse = new RegistrationResponse(false, ex.getMessage());
            return new  ResponseEntity<RegistrationResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
