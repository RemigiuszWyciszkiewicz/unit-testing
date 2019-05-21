package com.Remigiusz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


 class AccountTest {

    @Test
    void myTest() {
        Account account=new Account();
        assertFalse(account.isActive(), "Check if new account is not active");

    }

    @Test
    void myTest2() {
        Account account = new Account();

        account.setActive(true);
        assertTrue(account.isActive());
    }

}
