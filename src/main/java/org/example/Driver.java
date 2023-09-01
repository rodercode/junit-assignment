package org.example;

public class Driver {
    public boolean isAllowedToDrive(int age, boolean hasLicense){
        return age >= 18 && hasLicense;
    }
}
