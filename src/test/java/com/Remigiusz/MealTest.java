package com.Remigiusz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.core.IsNull.notNullValue;
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

    @Test
    void exceptionShouldBeThrownIfDiscountIsHigherThanPrice(){
        Meal meal_1=new Meal(8,"Soup");

        assertThrows(IllegalArgumentException.class,() -> meal_1.getDiscountedPrice(9));

    }

    @ParameterizedTest
    @ValueSource(ints = {2,3,4})
    void mealPricesShouldBeLowerThanTwenty(int price) {
        assertThat(price,lessThan(10));
    }
}