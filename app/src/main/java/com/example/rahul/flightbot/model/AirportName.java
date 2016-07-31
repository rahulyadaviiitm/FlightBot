package com.example.rahul.flightbot.model;

import java.util.List;

/**
 * Created by Rahul on 22-06-2016.
 */
public class AirportName {

    private List<AirportPlace> Places;

    public AirportName(List<AirportPlace> places) {
        Places = places;
    }

    public List<AirportPlace> getPlaces() {
        return Places;
    }

    public void setPlaces(List<AirportPlace> places) {
        Places = places;
    }
}
