package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DriverTest {
   /*
    Method: Is allowed to drive

    Description: This method check if a person is allowed to drive.
    */

    //* Variable
    Driver driver;

    @BeforeEach
    public void setup(){
        driver = new Driver();
    }
    @Test
    public void Should_ReturnTrue_If_AgeIsOverEighteen(){
        assertTrue(driver.isAllowedToDrive(22));
    }
    
    @Test
    public void Should_ReturnTrue_If_AgeIsEighteen(){
        assertTrue(driver.isAllowedToDrive(18));
    }

    @Test
    public void Should_ReturnFalse_If_AgeIsUnderSeventeen(){
        assertFalse(driver.isAllowedToDrive(17));
    }     
}