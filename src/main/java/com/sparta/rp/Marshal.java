package com.sparta.rp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.sparta.rp.pojos.EmployeePojo;
import com.sparta.rp.pojos.PeoplePojo;

public class Marshal {
    static XmlMapper xmlMapper = new XmlMapper();
    private static PeoplePojo peoplePojo = new PeoplePojo("male","fair", "blond","Luke Skywalker" );
    private static EmployeePojo employeePojo = new EmployeePojo(2, "Roshni", "Java SDET");
    static String  xml;

 public static String marshal(){
     try {
         xml = xmlMapper.writeValueAsString(peoplePojo);


     } catch (JsonProcessingException e) {
         e.printStackTrace();
     }
     return xml;

 }

    public static void main(String[] args) {
        System.out.println(marshal());
    }

}


