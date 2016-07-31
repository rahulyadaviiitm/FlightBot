package com.example.rahul.flightbot.model;

/**
 * Created by Rahul on 13-06-2016.
 */
public class QueryWraper {
    private String  Country;
    private String  Currency;
    private String  Locale;
    private int     Adults;
    private int     Children;
    private int     Infants;
    private String  OriginPlace;
    private String  DestinationPlace;
    private String  OutboundDate;
    private String  InboundDate;
    private String  LocationSchema;
    private String  CabinClass;
    private boolean GroupPricing;

    public QueryWraper(String country, String currency, String locale, int adults, int children, int infants, String originPlace, String destinationPlace, String outboundDate, String inboundDate, String locationSchema, String cabinClass, boolean groupPricing) {
        Country = country;
        Currency = currency;
        Locale = locale;
        Adults = adults;
        Children = children;
        Infants = infants;
        OriginPlace = originPlace;
        DestinationPlace = destinationPlace;
        OutboundDate = outboundDate;
        InboundDate = inboundDate;
        LocationSchema = locationSchema;
        CabinClass = cabinClass;
        GroupPricing = groupPricing;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getLocale() {
        return Locale;
    }

    public void setLocale(String locale) {
        Locale = locale;
    }

    public int getAdults() {
        return Adults;
    }

    public void setAdults(int adults) {
        Adults = adults;
    }

    public int getChildren() {
        return Children;
    }

    public void setChildren(int children) {
        Children = children;
    }

    public int getInfants() {
        return Infants;
    }

    public void setInfants(int infants) {
        Infants = infants;
    }

    public String getOriginPlace() {
        return OriginPlace;
    }

    public void setOriginPlace(String originPlace) {
        OriginPlace = originPlace;
    }

    public String getDestinationPlace() {
        return DestinationPlace;
    }

    public void setDestinationPlace(String destinationPlace) {
        DestinationPlace = destinationPlace;
    }

    public String getOutboundDate() {
        return OutboundDate;
    }

    public void setOutboundDate(String outboundDate) {
        OutboundDate = outboundDate;
    }

    public String getInboundDate() {
        return InboundDate;
    }

    public void setInboundDate(String inboundDate) {
        InboundDate = inboundDate;
    }

    public String getLocationSchema() {
        return LocationSchema;
    }

    public void setLocationSchema(String locationSchema) {
        LocationSchema = locationSchema;
    }

    public String getCabinClass() {
        return CabinClass;
    }

    public void setCabinClass(String cabinClass) {
        CabinClass = cabinClass;
    }

    public boolean isGroupPricing() {
        return GroupPricing;
    }

    public void setGroupPricing(boolean groupPricing) {
        GroupPricing = groupPricing;
    }
}
