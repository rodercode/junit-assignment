package org.example;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class DriverTest {
    // Check if a person is allow to drive
    // if a person is 18 and older then it should return true
    // which mean that a person is allow to drive

    @Test
    @DisplayName("Should only return true if a person is 18+ age old")
    public void shouldReturnTrueIfPersonIsEighteenPlus(){
        var driver = new Driver();
        assertTrue(driver.canYouDrive(18));
    }

    @Test
    @DisplayName("Should only return true if a person 20")
    public void shouldReturnTrueIfPersonIsTwenty(){
        var driver = new Driver();
        assertTrue(driver.canYouDrive(20));
    }
}