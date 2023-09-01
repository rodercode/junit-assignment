package org.example;

public class Convert {

    public double fahrenheitToCelsius(double fahrenheit){
        double value = (fahrenheit -32)/1.8;
        double roundedValue = Math.floor(value * 10) / 10.0;;
        return roundedValue;
    }
}
