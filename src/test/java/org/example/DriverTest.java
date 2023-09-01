package org.example;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DriverTest {
    // Check if a person is allow to drive
    // if a person is 18 and older then it should return true
    // which mean that a person is allow to drive

    
    //test name convention: MethodName_ExpectedBehavior_StateUnderTest

    //* Variable
    Driver driver;

    @BeforeEach
    public void setup(){
        driver = new Driver();
    }
    
    @Test
    @DisplayName("Should return true if a person is over 18 years old")
    public void isAllowedToDrive_AgeOver18_True(){
        assertTrue(driver.isAllowedToDrive(18));
    }
    
    @Test
    @DisplayName("Should return true if a person is 18 years old")
    public void isAllowedToDrive_AgeIs18_True(){
        assertTrue(driver.isAllowedToDrive(18));
    }

    @Test
    @Display("Should return false if a person is under 18 years old")
    public void isAllowedToDrive_AgeIsLower18_False(){
        assertFalse(driver.isAllowedToDrive(17));
    }     
}