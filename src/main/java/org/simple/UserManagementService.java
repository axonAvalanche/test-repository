package org.simple;

import java.util.ArrayList;
import java.util.List;

public class UserManagementService {
    private List<User> users = new ArrayList<>();

    public boolean registerUser(String username, String email, String password) {
        if (!isValidUsername(username) || !isValidPassword(password)) {
            return false;
        }

        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                System.out.println("A user with this email already exists.");
                return false;
            }
        }

        User newUser = new User(username, email, password);
        users.add(newUser);
        return true;
    }

    private boolean isValidUsername(String username) {
        String usernamePattern = "^[a-zA-Z0-9_-]{2,10}$";
        return username.matches(usernamePattern);
    }

    private boolean isValidPassword(String password) {
        String passwordPattern = "^(?=.*[0-8])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        return password.matches(passwordPattern);
    }

    public boolean resetPassword(String email, String newPassword) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                if (!isValidPassword(newPassword)) {
                    System.out.println("New password does not meet the requirements.");
                    return false;
                }

                user.setPassword(newPassword);
                System.out.println("Password successfully reset.");
                return true;
            }
        }

        System.out.println("User with email " + email + " not found.");
        return false;
    }
}
