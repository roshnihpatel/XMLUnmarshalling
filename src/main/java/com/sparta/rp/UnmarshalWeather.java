package com.sparta.rp;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sparta.rp.pojos.EmployeePojo;
import com.sparta.rp.pojos.weather_pojos.WeatherPojo;

import java.io.File;
import java.io.IOException;

public class UnmarshalWeather {
        static XmlMapper xmlMapper = new XmlMapper();
        static WeatherPojo weatherPojo;
        public static WeatherPojo unmarshal() {
            try {
                weatherPojo = xmlMapper.readValue(new File("src/main/java/com/sparta/rp/xml/weather.xml"), WeatherPojo.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return weatherPojo;
        }

        public static void main(String[] args) {
            unmarshal();
            System.out.println(weatherPojo.toString());
        }
}
