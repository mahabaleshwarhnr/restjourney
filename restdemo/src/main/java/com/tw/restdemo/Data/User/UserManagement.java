package com.tw.restdemo.Data.User;

import org.springframework.stereotype.Component;
import com.tw.restdemo.Data.User.User;

import java.util.HashMap;

@Component
public class UserManagement {

    private String greetingMessage;
    private static HashMap<String, User> userDB = new HashMap<String, User>();

    public String getGreetingMessage() {
        return greetingMessage;
    }

    public void setGreetingMessage(String message) {
        this.greetingMessage = message;
    }

    public static void register(User user) throws UserAlreadyExistException {
        String email = user.getEmail();
        if (userDB.get(email) == null) {
            userDB.put(email, user);
        } else {
            throw new UserAlreadyExistException();
        }
    }

    public static User getUserBy(String email) throws UserAlreadyExistException {
        User user = userDB.get(email);
        if (user != null) {
            return user;
        } else {
            throw new UserNotFoundException();
        }
    }
}
