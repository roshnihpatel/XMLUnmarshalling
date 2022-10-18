package com.sparta.rp.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PeoplePojo {

    @JsonProperty("gender")
    private String gender;
    @JsonProperty("skin_color")
    private String skinColor;
    @JsonProperty("hair_color")
    private String hairColor;
    @JsonProperty("name")
    private String name;




    public PeoplePojo() {
    }

    public PeoplePojo(String gender, String skinColor, String hairColor, String name) {
        this.gender = gender;
        this.skinColor = skinColor;
        this.hairColor = hairColor;
        this.name = name;
    }


    public String getGender(){
        return gender;
    }
    public String getSkinColor(){
        return skinColor;
    }
    public String getHairColor(){
        return hairColor;
    }
    public String getName(){
        return name;
    }


    @Override
    public String toString() {
        return "PeoplePojo{" +
                "gender='" + gender + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}