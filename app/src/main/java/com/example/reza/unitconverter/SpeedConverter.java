package com.example.reza.unitconverter;

public class SpeedConverter {

    ///meter_per_second
    public static double Meter_perSecond_toMeter_perSecond(double f)
    {
        return f;
    }
    public static double Meter_perSecond_toKiloMeter_perHour(double f)
    {
        return f*3.6;
    }
    public static double Meter_perSecond_toKiloMeter_perSecond(double f)
    {
        return f/1000;
    }
    public static double Meter_perSecond_toMile_perHour(double f)
    {
        return f*2.23694;
    }

    public static double Meter_perSecond_toFoot_perSecond(double f)
    {
        return f*3.281;
    }

    ///kilometer_per_hour
    public static double KiloMeter_perHour_toMeter_perSecond(double f)
    {
        return f/3.6;
    }
    public static double KiloMeter_perHour_toKiloMeter_perHour(double f)
    {
        return f;
    }
    public static double KiloMeter_perHour_toKiloMeter_perSecond(double f)
    {
        return f/3600;
    }
    public static double KiloMeter_perHour_toMile_perHour(double f)
    {
        return f/1.609;
    }

    public static double KiloMeter_perHour_toFoot_perSecond(double f)
    {
        return f/1.097;
    }



    ///kilometer_per_second
    public static double KiloMeter_perSecond_toMeter_perSecond(double f)
    {
        return f*1000;
    }
    public static double KiloMeter_perSecond_toKiloMeter_perHour(double f)
    {
        return f*3600;
    }
    public static double KiloMeter_perSecond_toKiloMeter_perSecond(double f)
    {
        return f;
    }
    public static double KiloMeter_perSecond_toMile_perHour(double f)
    {
        return f*2236.936;
    }
    public static double KiloMeter_perSecond_toFoot_perSecond(double f)
    {
        return f*3280.8399;
    }


    ///Mile_per_hour
    public static double Mile_perHour_toMeter_perSecond(double f)
    {
        return f/2.237;
    }
    public static double Mile_perHour_toKiloMeter_perHour(double f)
    {
        return f*1.60934;
    }
    public static double Mile_perHour_toKiloMeter_perSecond(double f)
    {
        return f/2237;
    }
    public static double Mile_perHour_toMile_perHour(double f)
    {
        return f;
    }

    public static double Mile_perHour_toFoot_perSecond(double f)
    {
        return f*1.467;

    }


    ///foot_per_second
    public static double Foot_perSecond_toMeter_perSecond(double f)
    {
        return f/3.281;

    }
    public static double Foot_perSecond_toKiloMeter_perHour(double f)
    {
        return f*1.097;
    }
    public static double Foot_perSecond_toKiloMeter_perSecond(double f)
    {
        return f/3281;
    }
    public static double Foot_perSecond_toMile_perHour(double f)
    {
        return f/1.467;
    }

    public static double Foot_perSecond_toFoot_perSecond(double f)
    {
        return f;
    }

}
