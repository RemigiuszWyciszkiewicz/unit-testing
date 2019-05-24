package com.Remigiusz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.hamcrest.core.IsNull;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.core.IsNull.notNullValue;
import java.time.Duration;

public class AddressTest {

    @ParameterizedTest
    @CsvSource ({"Fabryczna,10","Ligii Polskiej, 6"})
    void givenAddressenShouldNotBeEmptyAndHaveProperNames(String street,String number) {

        assertThat(street,notNullValue());
        assertThat(street,containsString("Ligi"));
        assertThat(number,notNullValue());
        assertThat(number.length(),lessThan(11));
    }


}
