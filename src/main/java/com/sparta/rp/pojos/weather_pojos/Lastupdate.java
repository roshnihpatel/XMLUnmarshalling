package com.sparta.rp.pojos.weather_pojos;

public class Lastupdate {
    private String value;

    public String getValue ()
    {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "value='" + value + '\'' +
                '}';
    }
}

