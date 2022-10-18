package com.sparta.rp.pojos.weather_pojos;

public class WeatherPojo {
    private Precipitation precipitation;

    private Visibility visibility;
    private City city;

    private Temperature temperature;

    private Weather weather;

    private Humidity humidity;

    private Pressure pressure;

    private Clouds clouds;

    private Lastupdate lastupdate;

    private Feels_like feels_like;

    private Wind wind;

    public Precipitation getPrecipitation ()
    {
        return precipitation;
    }

    public Visibility getVisibility ()
    {
        return visibility;
    }


    public City getCity ()
    {
        return city;
    }


    public Temperature getTemperature ()
    {
        return temperature;
    }


    public Weather getWeather ()
    {
        return weather;
    }

    public Humidity getHumidity ()
    {
        return humidity;
    }



    public Pressure getPressure ()
    {
        return pressure;
    }


    public Clouds getClouds ()
    {
        return clouds;
    }


    public Lastupdate getLastupdate ()
    {
        return lastupdate;
    }


    public Feels_like getFeels_like ()
    {
        return feels_like;
    }

    public Wind getWind ()
    {
        return wind;
    }


    @Override
    public String toString()
    {
        return "ClassPojo [precipitation = "+precipitation+", visibility = "+visibility+", city = "+city+", temperature = "+temperature+", weather = "+weather+", humidity = "+humidity+", pressure = "+pressure+", clouds = "+clouds+", lastupdate = "+lastupdate+", feels_like = "+feels_like+", wind = "+wind+"]";
    }
}
