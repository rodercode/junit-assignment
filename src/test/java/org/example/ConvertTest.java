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

    //*test name convention: MethodName_ExpectedBehavior_StateUnderTest


    //* Variable
    TempConverter convert;
    
    @BeforeEach
    public void setup(){
        convert = new TempConverter();
    }
    
    @Test
    @DisplayName("Should convert 68 fahrenheit to 20 celsius")
    public void fahrenheitToCelsius_68F_20C() {
        assertEquals(20, convert.fahrenheitToCelsius(68));
    }

    @Test
    @DisplayName("Should convert 32 fahrenheit to 0 celsius ")
    public void fahrenheitToCelsius_32F_0C(){
        assertEquals(0, convert.fahrenheitToCelsius(32));
    }

    @Test
    @DisplayName("Should convert 52 fahrenheit to 11 celsius")
    public void fahrenheitToCelsius_52F_11C(){
        assertEquals(11.1,convert.fahrenheitToCelsius(52));
    }
}