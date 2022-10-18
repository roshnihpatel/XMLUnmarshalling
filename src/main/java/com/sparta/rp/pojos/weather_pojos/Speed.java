package com.sparta.rp.pojos.weather_pojos;

public class Speed {
    private String unit;

    private String name;

    private String value;

    public String getUnit ()
    {
        return unit;
    }

    public String getName ()
    {
        return name;
    }

    public String getValue ()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [unit = "+unit+", name = "+name+", value = "+value+"]";
    }
}
