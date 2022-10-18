package com.sparta.rp.pojos.weather_pojos;

public class Wind {
    private String gusts;

    private Speed speed;

    private Direction direction;

    public String getGusts ()
    {
        return gusts;
    }

    public void setGusts (String gusts)
    {
        this.gusts = gusts;
    }

    public Speed getSpeed ()
    {
        return speed;
    }

    public Direction getDirection ()
    {
        return direction;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [gusts = "+gusts+", speed = "+speed+", direction = "+direction+"]";
    }
}
