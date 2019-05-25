package com.Remigiusz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    void cancel() {
        this.meals.clear();
    }

    int totalPrice() {

        int sum = 0;

        sum=this.meals.stream().mapToInt(Meal::getPrice).sum();

        if(sum<0) throw new IllegalStateException();
        else return sum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "meals=" + meals +
                '}';
    }
}
