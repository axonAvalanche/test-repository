package org.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseTest {

    @Test
    public void test() {
        UserManagementService service = new UserManagementService();

        var result = service.resetPassword("user@exmaple.com", "pass123");

        assertFalse(result);
    }

}