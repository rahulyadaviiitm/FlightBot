package com.example.rahul.flightbot.Interface;

import com.example.rahul.flightbot.model.AirportName;
import com.example.rahul.flightbot.model.FlightRefer;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Rahul on 22-06-2016.
 */
public interface GetAirportDetailsApi {
    @GET("{market}/{currency}/{locale}")
    Call<AirportName> getAirportList(@Path("market") String market,
                                    @Path("currency") String currency,
                                    @Path("locale") String locale,
                                    @Query("query") String query,
                                    @Query("apiKey") String apiKey);
}
