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

   


    //* Variable
    TempConverter convert;
    
    @BeforeEach
    public void setup(){
        convert = new TempConverter();
    }

     //*test name convention: Should_ExpectedBehaviour_When_state_Undertest
     // Should_ThrowException_When_AgeLessThan18
     // Should_ThrowException_When_AgeLessThan18
     @Test
    @DisplayName("Should convert 68 fahrenheit to 20 celsius")
    public void Should_ConvertToTwentyCelsius_When_FahrenheitIsSixtyEight() {
        assertEquals(20, convert.fahrenheitToCelsius(68));
    }

    @Test
    @DisplayName("Should convert 32 fahrenheit to 0 celsius ")
    public void Should_ConvertToZeroCelsius_When_FahrenheitIs32(){
        assertEquals(0, convert.fahrenheitToCelsius(32));
    }

    @Test
    @DisplayName("Should convert 52 fahrenheit to 11 celsius")

    public void Should_ConvertToEleven_When_FahrenheitIsFiftyTwo(){
        assertEquals(11.1,convert.fahrenheitToCelsius(52));
    }
}