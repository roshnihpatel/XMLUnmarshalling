package com.sparta.rp.pojos.weather_pojos;

public class Temperature {
    private String unit;

    private String min;

    private String max;

    private String value;

    public String getUnit ()
    {
        return unit;
    }

    public String getMin ()
    {
        return min;
    }

    public String getMax ()
    {
        return max;
    }

    public String getValue ()
    {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "unit='" + unit + '\'' +
                ", min='" + min + '\'' +
                ", max='" + max + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
