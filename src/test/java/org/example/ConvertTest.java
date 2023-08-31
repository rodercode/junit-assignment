package org.example;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {

    DecimalFormat df = new DecimalFormat();

    // A system should be able to convert F to C
    // user should enter F68
    // return C20
    @Test
    public void shouldReturnCelsiusTwenty() {
        var convert = new Convert();
        double value = (convert.fahrenheitToCelsius(68));
        assertEquals(20, convert.fahrenheitToCelsius(68));
    }

    @Test
    public void shouldReturnAroundCelsiusSeventeen() {
        var convert = new Convert();
        double value = (convert.fahrenheitToCelsius(62));
        assertEquals(16.6, value);
    }

}

