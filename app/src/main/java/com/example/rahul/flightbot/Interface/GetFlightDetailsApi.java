package com.example.rahul.flightbot.Interface;

import com.example.rahul.flightbot.model.FlightRefer;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Rahul on 14-06-2016.
 */
public interface GetFlightDetailsApi {

    @GET("{market}/{currency}/{locale}/{originPlace}/{destinationPlace}/{outboundPartialDate}/{inboundPartialDate}")
    Call<FlightRefer> getFlightList(@Path("market") String market,
                                  @Path("currency") String currency,
                                  @Path("locale") String locale,
                                  @Path("originPlace") String originPlace,
                                  @Path("destinationPlace") String destinationPlace,
                                  @Path("outboundPartialDate")String outboundPartialDate,
                                  @Path("inboundPartialDate") String inboundPartialDate,
                                  @Query("pageindex") Integer pageindex,
                                  @Query("pagesize") Integer pagesize,
                                  @Query("apiKey") String apiKey) ;
}
