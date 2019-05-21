package com.Remigiusz;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void shouldReturnDiscounterPrice() {

        //given
        Meal meal=new Meal(35);

        //when
        int discountedPrice = meal.getDiscountedPrice(7);

        //then
        assertEquals(28,discountedPrice);
    }

    @Test
    void referencesToTheSameObjectShouldBeEqual() {

        //given
        Meal meal_1=new Meal(10);
        Meal meal_2=meal_1;

        //then
        assertSame(meal_1,meal_2);
    }

    @Test
    void referencesToDifferentObjectShouldNotBeEqual() {

        //given
        Meal meal_1=new Meal(10);
        Meal meal_2=new Meal(5);

        //then
        assertNotSame(meal_1,meal_2);
    }

    @Test
    void twoMealsShouldBeEqualWhenPriceAndNameAreTheSame() {

        //given
        Meal meal_1=new Meal(10,"Pizza");
        Meal meal_2=new Meal(10,"Pizza");

        //then
        assertEquals(meal_1,meal_2,"checking if two meal are equal");
    }
}