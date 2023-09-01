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
    public void Should_ReturnTrue_If_AgeIsEighteen_And_HasLicense(){
        assertTrue(driver.isAllowedToDrive(18, true));
    }
    
     @Test
     public void Should_ReturnFalse_If_AgeIsOverEighteen_And_NoLicense(){
         assertFalse(driver.isAllowedToDrive(18, false));
     }

     @Test
     public void Should_ReturnFalse_If_AgeIsUnderSeventeen_And_HasLicense(){
         assertFalse(driver.isAllowedToDrive(17,false));
     } 
    
}