package com.sparta.rp.pojos.weather_pojos;

public class Humidity {
    private String unit;

    private String value;

    public String getUnit ()
    {
        return unit;
    }

    public String getValue ()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [unit = "+unit+", value = "+value+"]";
    }
}
