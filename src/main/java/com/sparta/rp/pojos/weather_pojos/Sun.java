package com.sparta.rp.pojos.weather_pojos;

public class Sun {

    private String set;

    private String rise;

    public String getSet ()
    {
        return set;
    }

    public String getRise ()
    {
        return rise;
    }

    @Override
    public String toString() {
        return "{" +
                "set='" + set + '\'' +
                ", rise='" + rise + '\'' +
                '}';
    }
}
