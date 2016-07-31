package com.example.rahul.flightbot.model;

import java.util.List;

/**
 * Created by Rahul on 12-06-2016.
 */
    public class FlightRefer
    {

        private QueryWraper Query;
        private String Status;
        private List<Itinerary> Itineraries;
        private List<Leg> Legs;
        private List<Segment> Segments;
        private List<Carrier> Carriers;
        private List<Agent> Agents;
        private List<Place> Places;
        private List<CurrencyWraper> Currencies;

        public FlightRefer(QueryWraper query, String status, List<Itinerary> itineraries, List<Leg> legs, List<Segment> segments, List<Carrier> carriers, List<Agent> agents, List<Place> places, List<CurrencyWraper> currencies) {
            Query = query;
            Status = status;
            Itineraries = itineraries;
            Legs = legs;
            Segments = segments;
            Carriers = carriers;
            Agents = agents;
            Places = places;
            Currencies = currencies;
        }

        public QueryWraper getQuery() {
            return Query;
        }

        public void setQuery(QueryWraper query) {
            Query = query;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String status) {
            Status = status;
        }

        public List<Itinerary> getItineraries() {
            return Itineraries;
        }

        public void setItineraries(List<Itinerary> itineraries) {
            Itineraries = itineraries;
        }

        public List<Leg> getLegs() {
            return Legs;
        }

        public void setLegs(List<Leg> legs) {
            Legs = legs;
        }

        public List<Segment> getSegments() {
            return Segments;
        }

        public void setSegments(List<Segment> segments) {
            Segments = segments;
        }

        public List<Carrier> getCarriers() {
            return Carriers;
        }

        public void setCarriers(List<Carrier> carriers) {
            Carriers = carriers;
        }

        public List<Agent> getAgents() {
            return Agents;
        }

        public void setAgents(List<Agent> agents) {
            Agents = agents;
        }

        public List<Place> getPlaces() {
            return Places;
        }

        public void setPlaces(List<Place> places) {
            Places = places;
        }

        public List<CurrencyWraper> getCurrencies() {
            return Currencies;
        }

        public void setCurrencies(List<CurrencyWraper> currencies) {
            Currencies = currencies;
        }
    }
