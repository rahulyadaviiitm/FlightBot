package com.example.rahul.flightbot.model;

/**
 * Created by Rahul on 13-06-2016.
 */
public class Place {
    private int Id;
    private int ParentId;
    private String Code;
    private String Type;
    private String Name;

    public Place(int id, int parentId, String code, String type, String name) {
        Id = id;
        ParentId = parentId;
        Code = code;
        Type = type;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getParentId() {
        return ParentId;
    }

    public void setParentId(int parentId) {
        ParentId = parentId;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
