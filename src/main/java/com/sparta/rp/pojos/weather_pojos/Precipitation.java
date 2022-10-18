package com.sparta.rp.pojos.weather_pojos;

public class Precipitation {
    private String mode;

    public String getMode () {
        return mode;
    }

    @Override
    public String toString() {
        return "{" +
                "mode='" + mode + '\'' +
                '}';
    }
}
