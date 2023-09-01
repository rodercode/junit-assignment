package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {
    // A system should be able to convert F to C
    // user should enter F68
    // return C20

    Convert convert;

    @BeforeEach
    public void setup(){
        convert = new Convert();
    }

    @Test
    @DisplayName("Should convert 68F to 20C")
    public void shouldReturnCelsiusTwenty() {
        assertEquals(20, convert.fahrenheitToCelsius(68));
    }

    @Test
    @DisplayName("")
    public void shouldReturnCelsiusZero(){
    }
}