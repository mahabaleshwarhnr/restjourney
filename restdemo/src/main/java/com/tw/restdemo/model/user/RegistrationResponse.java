package com.tw.restdemo.model.user;

public class RegistrationResponse {

    private boolean status;
    private String message;

    public RegistrationResponse(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
