package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ConvertTest {
    /*

    Method: Fahrenheit to Celsius

    Description: This method enables users to convert temperatures from Fahrenheit to Celsius.
    Additionally, it ensures that the converted value is rounded to one decimal place
    in case of uneven results.

    */
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
    @DisplayName("Should convert 32F to 0C ")
    public void shouldReturnCelsiusZero(){
        assertEquals(0, convert.fahrenheitToCelsius(32));
    }

    @Test
    @DisplayName("Should convert 52F to 11C")
    public void shouldReturnADecimalValue(){
        assertEquals(11.1,convert.fahrenheitToCelsius(52));
    }
}