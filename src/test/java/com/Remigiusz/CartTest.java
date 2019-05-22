package com.Remigiusz;

import org.hamcrest.core.IsNull;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.core.IsNull.notNullValue;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void symulateLargeOrder() {

        //given
        Cart cart=new Cart();

        //than
        assertTimeout(Duration.ofMillis(10),cart::symulateLargeOrder);
    }

    @Test
    void cardShouldBeEmptyAfterAddingOrderToCard() {
        //given
        Order order=new Order();
        Cart cart=new Cart();

        //when
        cart.addOrderToCard(order);

        //then
        assertThat(cart.getOrders(), anyOf(
                hasSize(0),
                nullValue(),
                notNullValue(),
                is(not(emptyCollectionOf(Order.class)))
        )) ;
        assertThat(cart.getOrders(), allOf(
                notNullValue(),
                hasItem(order)

        ));

        assertAll("Group assertion for card",
                () -> {assertThat(cart.getOrders(),notNullValue());},
                () -> {assertThat(cart.getOrders(),hasSize(1));},
                () -> assertThat(cart.getOrders(),hasItem(order))
                );
    }
}