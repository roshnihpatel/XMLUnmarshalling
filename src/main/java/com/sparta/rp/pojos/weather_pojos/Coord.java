package com.sparta.rp.pojos.weather_pojos;

public class Coord {
    private String lon;

    private String lat;

    public String getLon ()
    {
        return lon;
    }

    public String getLat ()
    {
        return lat;
    }

    @Override
    public String toString() {
        return "{" +
                "lon='" + lon + '\'' +
                ", lat='" + lat + '\'' +
                '}';
    }
}
