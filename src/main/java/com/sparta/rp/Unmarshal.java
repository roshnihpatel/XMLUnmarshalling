package com.sparta.rp;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sparta.rp.pojos.EmployeePojo;
import com.sparta.rp.pojos.weather_pojos.WeatherPojo;

import java.io.File;
import java.io.IOException;

public class Unmarshal {
      static XmlMapper xmlMapper = new XmlMapper();
      static EmployeePojo employeePojo;
      public static EmployeePojo unmarshal() {
            try {
                  employeePojo = xmlMapper.readValue(new File("src/main/java/com/sparta/rp/xml/RPEmployee.xml"), EmployeePojo.class);
            } catch (IOException e) {
                  e.printStackTrace();
            }
            return employeePojo;
      }

      public static void main(String[] args) {
            unmarshal();
            System.out.println(employeePojo.toString());
      }


}
