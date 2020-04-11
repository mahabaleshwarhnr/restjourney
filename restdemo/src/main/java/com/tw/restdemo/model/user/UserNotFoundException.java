package com.tw.restdemo.model.user;

public class UserNotFoundException extends RuntimeException {

    @Override
    public String getMessage() {
        return "User not found. Please register";
    }
}
