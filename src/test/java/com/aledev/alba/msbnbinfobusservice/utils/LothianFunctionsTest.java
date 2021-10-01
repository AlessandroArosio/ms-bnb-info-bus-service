package com.aledev.alba.msbnbinfobusservice.utils;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LothianFunctionsTest {
    LothianFunctions functions;

    @Disabled //todo
    @Test
    void getBusTimes_WithVarargs_ReturnsString() {
        functions = new LothianFunctions();

        String first = "first";
        String second = "second";
        String third = "third";

        String busTimes = functions.getBusTimes(first, second, third);

        assertThat(busTimes).isEqualTo("&function=getBusTimes&first1&second2&third3");
    }
}
