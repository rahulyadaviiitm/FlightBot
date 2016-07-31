package com.example.rahul.flightbot.model;

import java.util.List;

/**
 * Created by Rahul on 13-06-2016.
 */
public class Itinerary {
    private String OutboundLegId;
    private String InboundLegId;
    private List<PricingOption> PricingOptions;

    public Itinerary(String outboundLegId, String inboundLegId, List<PricingOption> pricingOptions) {
        OutboundLegId = outboundLegId;
        InboundLegId = inboundLegId;
        PricingOptions = pricingOptions;
    }

    public String getOutboundLegId() {
        return OutboundLegId;
    }

    public void setOutboundLegId(String outboundLegId) {
        OutboundLegId = outboundLegId;
    }

    public String getInboundLegId() {
        return InboundLegId;
    }

    public void setInboundLegId(String inboundLegId) {
        InboundLegId = inboundLegId;
    }

    public List<PricingOption> getPricingOptions() {
        return PricingOptions;
    }

    public void setPricingOptions(List<PricingOption> pricingOptions) {
        PricingOptions = pricingOptions;
    }
}
