package org.example;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {
    // A system should be able to convert F to C
    // user should enter F68
    // return C20
    @Test
    public void shouldReturnCelsiusTwenty() {
        var convert = new Convert();
        assertEquals(20, convert.fahrenheitToCelsius(68));
    }

}

