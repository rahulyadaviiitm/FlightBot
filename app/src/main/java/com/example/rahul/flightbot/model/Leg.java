package com.example.rahul.flightbot.model;

import java.util.List;

/**
 * Created by Rahul on 13-06-2016.
 */
public class Leg {

    private String Id;
    private List<Integer> SegmentIds;
    private int OriginStation;
    private int DestinationStation;
    private String Departure;
    private String Arrival;
    private int Durations;
    private String JourneyMode;
    private List<Integer> Stops;
    private List<Integer> Carriers;
    private List<Integer> OperatingCarriers;
    private String Directionality;
    private List<FlightNumber> FlightNumbers;

    public Leg(String id, List<Integer> segmentIds, int originStation, int destinationStation, String departure, String arrival, int durations, String journeyMode, List<Integer> stops, List<Integer> carriers, List<Integer> operatingCarriers, String directionality, List<FlightNumber> flightNumbers) {
        Id = id;
        SegmentIds = segmentIds;
        OriginStation = originStation;
        DestinationStation = destinationStation;
        Departure = departure;
        Arrival = arrival;
        Durations = durations;
        JourneyMode = journeyMode;
        Stops = stops;
        Carriers = carriers;
        OperatingCarriers = operatingCarriers;
        Directionality = directionality;
        FlightNumbers = flightNumbers;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public List<Integer> getSegmentIds() {
        return SegmentIds;
    }

    public void setSegmentIds(List<Integer> segmentIds) {
        SegmentIds = segmentIds;
    }

    public int getOriginStation() {
        return OriginStation;
    }

    public void setOriginStation(int originStation) {
        OriginStation = originStation;
    }

    public int getDestinationStation() {
        return DestinationStation;
    }

    public void setDestinationStation(int destinationStation) {
        DestinationStation = destinationStation;
    }

    public String getDeparture() {
        return Departure;
    }

    public void setDeparture(String departure) {
        Departure = departure;
    }

    public String getArrival() {
        return Arrival;
    }

    public void setArrival(String arrival) {
        Arrival = arrival;
    }

    public int getDurations() {
        return Durations;
    }

    public void setDurations(int durations) {
        Durations = durations;
    }

    public String getJourneyMode() {
        return JourneyMode;
    }

    public void setJourneyMode(String journeyMode) {
        JourneyMode = journeyMode;
    }

    public List<Integer> getStops() {
        return Stops;
    }

    public void setStops(List<Integer> stops) {
        Stops = stops;
    }

    public List<Integer> getCarriers() {
        return Carriers;
    }

    public void setCarriers(List<Integer> carriers) {
        Carriers = carriers;
    }

    public List<Integer> getOperatingCarriers() {
        return OperatingCarriers;
    }

    public void setOperatingCarriers(List<Integer> operatingCarriers) {
        OperatingCarriers = operatingCarriers;
    }

    public String getDirectionality() {
        return Directionality;
    }

    public void setDirectionality(String directionality) {
        Directionality = directionality;
    }

    public List<FlightNumber> getFlightNumbers() {
        return FlightNumbers;
    }

    public void setFlightNumbers(List<FlightNumber> flightNumbers) {
        FlightNumbers = flightNumbers;
    }
}
