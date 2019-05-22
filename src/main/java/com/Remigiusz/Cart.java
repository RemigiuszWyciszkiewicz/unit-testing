package com.Remigiusz;

import java.util.ArrayList;
import java.util.List;

public class Cart {


    private List<Order> orders = new ArrayList<>();

    void addOrderToCard(Order order) {
        this.orders.add(order);
    }

    void clearCard() {
        this.orders.clear();
    }

    void symulateLargeOrder() {

        for (int i = 0; i < 1000; i++) {
            Meal meal = new Meal(i % 10, "Hambueger" + i);
            Order order = new Order();
            order.addMeal(meal);
            addOrderToCard(order);
        }

        clearCard();

    }

    public List<Order> getOrders() {
        return orders;
    }
}
