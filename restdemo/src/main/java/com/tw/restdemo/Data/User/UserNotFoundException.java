package com.tw.restdemo.Data.User;

public class UserNotFoundException extends RuntimeException {

    @Override
    public String getMessage() {
        return "User not found. Please register";
    }
}
