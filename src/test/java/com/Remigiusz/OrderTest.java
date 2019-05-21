package com.Remigiusz;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.core.IsNull.*;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderTest {

    @Test
    void testAssertArrayEquals() {

        //given
        int[] ints1 = {1 , 2 , 3};
        int[] ints2 = {1 , 2 , 3};

        //then
        assertArrayEquals(ints1,ints2);
    }

    @Test
   void mealListShouldBEEmptyAfterCreatonOrder() {
        //given
        Order order=new Order();

        //then
        assertThat(order.getMeals(),empty());
        assertThat(order.getMeals().size(),is(0));
        assertThat(order.getMeals(),hasSize(0));

    }

    @Test
        void addingMealToORderShouldIncreseORderSize() {

        //given
        Meal meal_1=new Meal(20,"Potato");
        Meal meal_2=new Meal(15,"Sandwich");
        Order order=new Order();


        //when
        order.addMeal(meal_2);

        //then
        assertThat(order.getMeals(),hasSize(1));
        assertThat(order.getMeals(),contains(meal_2));
        assertThat(order.getMeals().get(0).getPrice(), is(15));
    }

    @Test
    void removingMealFromOrderShouldDecreseOrderSize() {

        //given
        Meal meal_2=new Meal(15,"Sandwich");
        Order order=new Order();

        //when
        order.addMeal(meal_2);
        order.deleteMeal(meal_2);

        //then
        assertThat(order.getMeals(),hasSize(0));
        assertThat(order.getMeals(),not(contains(meal_2)));
    }

    @Test
    void mealsShouldBeInCorrectOrderAfterAddingThemOrder() {

        //given
        Meal meal_1=new Meal(20,"Pizza");
        Meal meal_2=new Meal(15,"Sandwich");
        Order order=new Order();

        //when
        order.addMeal(meal_2);
        order.addMeal(meal_1);


        //then
        assertThat(order.getMeals(),contains(meal_2,meal_1));
        assertThat(order.getMeals(),containsInAnyOrder(meal_1,meal_2));

    }

    @Test
    void testIfTwoMealListAreTheSame() {

        //given
        Meal meal_1=new Meal(20,"Pizza");
        Meal meal_2=new Meal(15,"Sandwich");
        Meal meal_3=new Meal(30,"Burger");

        //when
        List<Meal> mealsList_1= Arrays.asList(meal_1,meal_2);
        List<Meal> mealsList_2= Arrays.asList(meal_1,meal_2);

        //then
        assertThat(mealsList_1,  is(mealsList_2));


    }
}
