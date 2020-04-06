package com.tw.restdemo.Data.User;


public class UserAlreadyExistException extends RuntimeException {

    @Override
    public String getMessage() {
        return "User Already Exist";
    }
}


