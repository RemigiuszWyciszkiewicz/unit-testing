package com.Remigiusz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.core.IsNull.notNullValue;


public class OrderStatusTest {

    @ParameterizedTest
    @EnumSource(OrderStatus.class)
    void allOrderStatusShouldBeShortherThan20Characters(OrderStatus orderStatus) {

        assertThat(orderStatus.toString().length(),lessThan(15));

    }

    @ParameterizedTest
    @MethodSource("createMealWithNameAndPrice")
    void burgersShouldHaveCorrectNameAndPrice(String name,int price) {
        assertThat(name,containsString("Kebab"));
        assertThat(price,greaterThanOrEqualTo(10));
    }

    private static Stream<Arguments> createMealWithNameAndPrice(){
            return Stream.of(
                    Arguments.of("Hamburger",10),
                    Arguments.of("Kebab",13),
                    Arguments.of("Fish",20)
            );
    }

    @ParameterizedTest
    @MethodSource("createCakeNames")
    void cackenamesShouldEndWithCake(String name) {

        assertThat(name,notNullValue());
        assertThat(name,endsWith("cake"));
    }

    private static Stream<String> createCakeNames() {
        List<String> strings = Arrays.asList("cheesecake","Fruitcake","Cupcake");

        return strings.stream();
    }

}
