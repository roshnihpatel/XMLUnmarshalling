package com.sparta.rp.pojos.weather_pojos;

public class Weather {
    private String number;

    private String icon;

    private String value;

    public String getNumber ()
    {
        return number;
    }

    public String getIcon ()
    {
        return icon;
    }

    public String getValue ()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [number = "+number+", icon = "+icon+", value = "+value+"]";
    }

}
