package com.sparta.rp.pojos.weather_pojos;

public class Clouds {
    private String name;

    private String value;

    public String getName ()
    {
        return name;
    }

    public String getValue ()
    {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
