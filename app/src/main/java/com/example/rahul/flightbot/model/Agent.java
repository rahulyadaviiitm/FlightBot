package com.example.rahul.flightbot.model;

/**
 * Created by Rahul on 13-06-2016.
 */
public class Agent {
    private int id;
    private String Name;
    private String ImageUrl;
    private String Status;
    private boolean OptimisedForMobile;
    private String BookingNumer;
    private String Type;

    public Agent(int id, String name, String imageUrl, String status, boolean optimisedForMobile, String bookingNumer, String type) {
        this.id = id;
        Name = name;
        ImageUrl = imageUrl;
        Status = status;
        OptimisedForMobile = optimisedForMobile;
        BookingNumer = bookingNumer;
        Type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public boolean isOptimisedForMobile() {
        return OptimisedForMobile;
    }

    public void setOptimisedForMobile(boolean optimisedForMobile) {
        OptimisedForMobile = optimisedForMobile;
    }

    public String getBookingNumer() {
        return BookingNumer;
    }

    public void setBookingNumer(String bookingNumer) {
        BookingNumer = bookingNumer;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
