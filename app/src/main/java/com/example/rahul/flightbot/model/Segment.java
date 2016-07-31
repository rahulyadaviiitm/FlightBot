package com.example.rahul.flightbot.model;

/**
 * Created by Rahul on 13-06-2016.
 */
public class Segment {
    private int Id;
    private int OriginStation;
    private int DestinationStation;
    private String DepartureDateTime;
    private String ArrivalDateTime;
    private int Carrier;
    private int OperatingCarrier;
    private int Duration;
    private String FlightNumber;
    private String JourneyMode;
    private String Directionality;

    public Segment(int id, int originStation, int destinationStation, String departureDateTime, String arrivalDateTime, int carrier, int operatingCarrier, int duration, String flightNumber, String journeyMode, String directionality) {
        Id = id;
        OriginStation = originStation;
        DestinationStation = destinationStation;
        DepartureDateTime = departureDateTime;
        ArrivalDateTime = arrivalDateTime;
        Carrier = carrier;
        OperatingCarrier = operatingCarrier;
        Duration = duration;
        FlightNumber = flightNumber;
        JourneyMode = journeyMode;
        Directionality = directionality;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public String getDepartureDateTime() {
        return DepartureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        DepartureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return ArrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        ArrivalDateTime = arrivalDateTime;
    }

    public int getCarrier() {
        return Carrier;
    }

    public void setCarrier(int carrier) {
        Carrier = carrier;
    }

    public int getOperatingCarrier() {
        return OperatingCarrier;
    }

    public void setOperatingCarrier(int operatingCarrier) {
        OperatingCarrier = operatingCarrier;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        FlightNumber = flightNumber;
    }

    public String getJourneyMode() {
        return JourneyMode;
    }

    public void setJourneyMode(String journeyMode) {
        JourneyMode = journeyMode;
    }

    public String getDirectionality() {
        return Directionality;
    }

    public void setDirectionality(String directionality) {
        Directionality = directionality;
    }
}
