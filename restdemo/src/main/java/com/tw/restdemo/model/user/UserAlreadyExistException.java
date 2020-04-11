package com.tw.restdemo.model.user;


public class UserAlreadyExistException extends RuntimeException {

    @Override
    public String getMessage() {
        return "User Already Exist";
    }
}


