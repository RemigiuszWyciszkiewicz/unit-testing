package com.Remigiusz;

import java.util.Objects;

public class Meal {

    private int price;
    private String namel;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public Meal(int price, String namel, int quantity) {
        this.price = price;
        this.namel = namel;
        this.quantity = quantity;
    }

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

        if(discount> this.price) {
            throw new IllegalArgumentException("Discount can not be higher than the price");
        }
        return   this.price-discount;
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

    @Override
    public String toString() {
        return "Meal{" +
                "namel='" + namel + '\'' +
                '}';
    }
}
