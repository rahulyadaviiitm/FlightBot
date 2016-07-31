package com.example.rahul.flightbot.model;

/**
 * Created by Rahul on 13-06-2016.
 */
public class Carrier {
    private  int Id;
    private  String Code;
    private String Name;
    private String ImageUrl;
    private String DisplayCode;

    public Carrier(int id, String code, String name, String imageUrl, String displayCode) {
        Id = id;
        Code = code;
        Name = name;
        ImageUrl = imageUrl;
        DisplayCode = displayCode;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public String getDisplayCode() {
        return DisplayCode;
    }

    public void setDisplayCode(String displayCode) {
        DisplayCode = displayCode;
    }
}
