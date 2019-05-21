package com.Remigiusz;

import java.util.Objects;

public class Meal {

    private int price;
    private String namel;

    public Meal(int price, String namel) {
        this.price = price;
        this.namel = namel;
    }

    public Meal(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountedPrice(int discount) {
        return this.price-discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return price == meal.price &&
                Objects.equals(namel, meal.namel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, namel);
    }
}
