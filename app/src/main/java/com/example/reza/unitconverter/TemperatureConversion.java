package com.example.reza.unitconverter;

public class TemperatureConversion {
    public static double Celsius_toCelsius(double f)
    {
        return f;
    }
    public static double Celsius_toFahrenheit(double f)
    {
        return f*9/5+32;
    }
    public static double Celsius_toKelvin(double f)
    {
        return f+273.15;
    }
    public static double Celsius_toRankine(double f)
    {
        return f*9/5+491.67;
    }



    public static double Fahrenheit_toCelsius(double f)
    {
        return (f-32)*5/9;
    }

    public static double Fahrenheit_toFahrenheit(double f)
    {
        return f;
    }
    public static double Fahrenheit_toKelvin(double f)
    {
        return (f-32)*5/9+273.15;
    }
    public static double Fahrenheit_toRankine(double f)
    {
        return f+459.67;
    }



    public static double Kelvin_toCelsius(double f)
    {
        return f-273.15;
    }
    public static double Kelvin_toFahrenheit(double f)
    {
        return (f-273.15)*9/5+32;
    }
    public static double Kelvin_toKelvin(double f)
    {
        return f;
    }
    public static double Kelvin_toRankine(double f)
    {
        return f*1.8;
    }



    public static double Rankine_toCelsius(double f)
    {
        return (f-491.67)*5/9;
    }
    public static double Rankine_toFahrenheit(double f)
    {
        return f-459.67;
    }
    public static double Rankine_toKelvin(double f)
    {
        return f*5/9;
    }
    public static double Rankine_toRankine(double f)
    {
        return f;
    }






}
