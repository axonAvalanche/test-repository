package org.simple;

import java.text.MessageFormat;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        var service = new UserManagementService();
        service.registerUser("user", "user@example.com", "Password123@");
    }
}