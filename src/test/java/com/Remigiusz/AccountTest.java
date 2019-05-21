package com.Remigiusz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


 class AccountTest {

    @Test
    void newlyCreatedaccountShouldBeNotActive() {

        Account account=new Account();
        assertFalse(account.isActive(), "Check if new account is not active");

    }

    @Test
    void activatedAccountShouldBeActive() {

        //given
        Account account = new Account();

        //when
        account.setActive(true);

        //then
        assertTrue(account.isActive());
    }

    @Test
     void newlyCreatedAccountShouldHaveNullAsAddress() {

        //given
        Account account=new Account();

        //when
        Address address=account.getDefaultDeliveryAddress();

        //then
        assertNull(address);

    }

    @Test
     void defaultDeliveryAddressShouldNotBeNullAfterBeingSet() {

        //given
        Address address=new Address("Wyszyńskiego",15);
        Account account=new Account();
        account.setDefaultDeliveryAddress(address);

        //when
        Address defaultDeliveryAddress=account.getDefaultDeliveryAddress();

        //then
        assertNotNull(defaultDeliveryAddress);

    }

}
