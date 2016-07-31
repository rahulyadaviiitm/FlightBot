package com.example.rahul.flightbot.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.example.rahul.flightbot.Interface.GetFlightDetailsApi;
import com.example.rahul.flightbot.R;
import com.example.rahul.flightbot.RecyclerAdapter;
import com.example.rahul.flightbot.model.FlightRefer;
import com.squareup.okhttp.OkHttpClient;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class ResultActivity extends AppCompatActivity {
    String basic_url = "http://partners.api.skyscanner.net/apiservices/pricing/v1.0/";
    String apikey = "an790354552793754474773992383118";
    String country, currency, locale, from, to, outdate, indate;
    int adult, children, infants,pageindex,pagesize;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerView= (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        Intent i =getIntent();
        country = "IN";
        currency = "INR";
        locale="en-GB";
        from = i.getStringExtra("from")+"-sky";
        to = i.getStringExtra("to")+"-sky";
        adult = 1;
        children = 0;
        infants = 0;
        outdate = i.getStringExtra("outDate");
        indate = i.getStringExtra("indate");
        pageindex=2;
        pagesize=5;
        final ProgressDialog progress = new ProgressDialog(ResultActivity.this);
        progress.setTitle("Loading");
        progress.setMessage("Please Wait.....");
        progress.show();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(basic_url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();
        GetFlightDetailsApi api = retrofit.create(GetFlightDetailsApi.class);
        Call<FlightRefer> response = api.getFlightList(country, currency, locale, from, to, outdate, indate,pageindex ,pagesize,apikey);
        response.enqueue(new Callback<FlightRefer>() {

            @Override
            public void onResponse(Response<FlightRefer> response) {

                if (response == null) return;
                else {
                    progress.cancel();
                    FlightRefer flightRefer = response.body();
                        RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), flightRefer);
                        recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Throwable t) {
               progress.setMessage("Retrofit Error Occured");
            }
        });



    }
}