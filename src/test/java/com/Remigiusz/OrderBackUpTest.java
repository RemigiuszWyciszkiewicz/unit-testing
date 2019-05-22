package com.Remigiusz;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class OrderBackUpTest {

   static OrderBackUp orderBackUp;

    @BeforeAll
    static void setup() throws IOException {
        orderBackUp= new OrderBackUp();
        orderBackUp.createFile();
    }

    @AfterAll
    static void tearDown() throws IOException {
        orderBackUp.closeFile();
    }

    @Test
    void backUpOrderWithOneMeal() throws IOException {
        //given
        Meal meal=new Meal(7,"Burger");
        Order order=new Order();
        order.addMeal(meal);

        //when
        orderBackUp.backupOrder(order);

        //then

    }
}
