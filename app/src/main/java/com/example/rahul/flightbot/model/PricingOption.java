package com.example.rahul.flightbot.model;

import java.util.List;

/**
 * Created by Rahul on 13-06-2016.
 */
public class PricingOption {

    private List<Integer> Agents;
    private int QuoteAgeInMinutes;
    private int Price;
    private String DeeplinkUrl;

    public PricingOption(List<Integer> agents, int quoteAgeInMinutes, int price, String deeplinkUrl) {
        Agents = agents;
        QuoteAgeInMinutes = quoteAgeInMinutes;
        Price = price;
        DeeplinkUrl = deeplinkUrl;
    }

    public List<Integer> getAgents() {
        return Agents;
    }

    public void setAgents(List<Integer> agents) {
        Agents = agents;
    }

    public int getQuoteAgeInMinutes() {
        return QuoteAgeInMinutes;
    }

    public void setQuoteAgeInMinutes(int quoteAgeInMinutes) {
        QuoteAgeInMinutes = quoteAgeInMinutes;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getDeeplinkUrl() {
        return DeeplinkUrl;
    }

    public void setDeeplinkUrl(String deeplinkUrl) {
        DeeplinkUrl = deeplinkUrl;
    }
}
