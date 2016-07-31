package com.example.rahul.flightbot.model;

/**
 * Created by Rahul on 13-06-2016.
 */
public class FlightNumber {
    private String FlightNumber;
    private int CarrierId;

    public FlightNumber(String flightNumber, int carrierId) {
        FlightNumber = flightNumber;
        CarrierId = carrierId;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        FlightNumber = flightNumber;
    }

    public int getCarrierId() {
        return CarrierId;
    }

    public void setCarrierId(int carrierId) {
        CarrierId = carrierId;
    }
}
