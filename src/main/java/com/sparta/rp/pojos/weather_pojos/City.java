package com.sparta.rp.pojos.weather_pojos;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class City {
    private String country;

    private Coord coord;

    private String timezone;

    private String name;
    @JacksonXmlProperty(isAttribute = true)
    private String id;

    private Sun sun;

    public String getCountry ()
    {
        return country;
    }

    public Coord getCoord ()
    {
        return coord;
    }

    public String getTimezone ()
    {
        return timezone;
    }

    public String getName ()
    {
        return name;
    }

    public String getId ()
    {
        return id;
    }

    public Sun getSun ()
    {
        return sun;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [country = "+country+", coord = "+coord+", timezone = "+timezone+", name = "+name+", id = "+id+", sun = "+sun+"]";
    }
}
