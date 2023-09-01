package org.example;
public class TempConverter {
    public double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit -32)/1.8;
        return roundToOneDecimalPlace(celsius);
    }

    public double roundToOneDecimalPlace(double value){
        return Math.floor(value * 10) / 10.0;
    }
}
