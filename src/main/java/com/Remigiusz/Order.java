package com.Remigiusz;

import java.util.ArrayList;
import java.util.List;

public class Order {


    private List<Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal) {
        this.meals.add(meal);

    }

    public void deleteMeal(Meal meal) {
        this.meals.remove(meal);
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
}
