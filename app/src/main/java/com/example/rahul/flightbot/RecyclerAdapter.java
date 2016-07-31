package com.example.rahul.flightbot;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rahul.flightbot.model.FlightRefer;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rahul on 15-06-2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    Context context;
    LayoutInflater inflater;
    FlightRefer flightRefer;
    List<String> oDepartTime =new ArrayList<>();
    List<String> oArrivalTime=new ArrayList<>();
    List<String> iDepartTime =new ArrayList<>();
    List<String> iArrivalTime=new ArrayList<>();
    List<String> outBoundLegId =new ArrayList<>();
    List<String> inBoundLegId=new ArrayList<>();
    List<String> oImageUrl=new ArrayList<>();
    List<String> iImageUrl=new ArrayList<>();
    List<String> oDepartOnlyTime =new ArrayList<>();
    List<String> oArrivalOnlyTime=new ArrayList<>();
    List<String> iDepartOnlyTime=new ArrayList<>();
    List<String> iArrivalOnlyTime=new ArrayList<>();
    List<Integer > price=new ArrayList<>();
    List<Integer> oduration=new ArrayList<>();
    List<Integer> ostop=new ArrayList<>();
    List<Integer> ocarrier=new ArrayList<>();
    List<Integer> iduration=new ArrayList<>();
    List<Integer> istop=new ArrayList<>();
    List<Integer> icarrier=new ArrayList<>();
    /*int[] oduration;
    int[] ostop;
    int[] ocarrier;
    int[] iduration;
    int[] istop;
    int[] icarrier;*/
    String originCode;
    String originName;
    String   destCode;
     String   destName;
    int totalpass;
    String currenySymbol;
    public RecyclerAdapter(Context context,FlightRefer flightRefer)
    {
        this.context=context;
        inflater=LayoutInflater.from(context);
        this.flightRefer=flightRefer;

        getData();
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.list_item, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);

        return viewHolder;
    }

    private void getData() {
        for(int i=0;i<flightRefer.getItineraries().size();i++) {
         outBoundLegId.add(i, flightRefer.getItineraries().get(i).getOutboundLegId());
         inBoundLegId.add(i, flightRefer.getItineraries().get(i).getInboundLegId());
         price.add(i, flightRefer.getItineraries().get(i).getPricingOptions().get(0).getPrice());
         for(int j=0;j<flightRefer.getLegs().size();j++)
         {
             if(outBoundLegId.get(i).equals(flightRefer.getLegs().get(j).getId())){
             oDepartTime.add(i, flightRefer.getLegs().get(j).getDeparture());
             String[] separated = oDepartTime.get(i).split("T");
             oDepartOnlyTime.add(i, separated[1]);
             oArrivalTime.add(i, flightRefer.getLegs().get(j).getArrival());
             String[] separatedAtime = oArrivalTime.get(i).split("T");
             oArrivalOnlyTime.add(i, separatedAtime[1]);
             oduration.add(i, flightRefer.getLegs().get(j).getDurations());
             ostop.add(i, flightRefer.getLegs().get(j).getStops().size());
             ocarrier.add(i, flightRefer.getLegs().get(j).getCarriers().get(0));
                 for(int k=0;k<flightRefer.getCarriers().size();k++){
                     if(ocarrier.get(i).equals(flightRefer.getCarriers().get(k).getId()))
                     {
                         oImageUrl.add(i, flightRefer.getCarriers().get(k).getImageUrl());

                     }
                 }
             }
         }
            for(int a=0;a<flightRefer.getLegs().size();a++)
            {
                if(inBoundLegId.get(i).equals(flightRefer.getLegs().get(a).getId())){
                    iDepartTime.add(i, flightRefer.getLegs().get(a).getDeparture());
                    String[] iDseparated = iDepartTime.get(i).split("T");
                    iDepartOnlyTime.add(i, iDseparated[1]);
                    iArrivalTime.add(i, flightRefer.getLegs().get(a).getArrival());
                    String[] iAseparated = iArrivalTime.get(i).split("T");
                    iArrivalOnlyTime.add(i, iAseparated[1]);
                    iduration.add(i, flightRefer.getLegs().get(a).getDurations());
                    istop.add(i, flightRefer.getLegs().get(a).getStops().size());
                    icarrier.add(i, flightRefer.getLegs().get(a).getCarriers().get(0));
                    for(int b=0;b<flightRefer.getCarriers().size();b++){
                        if(icarrier.get(i).equals(flightRefer.getCarriers().get(b).getId()))
                        {
                            iImageUrl.add(i, flightRefer.getCarriers().get(b).getImageUrl());

                        }
                    }
                }
            }
        }
        for(int c=0;c<flightRefer.getPlaces().size();c++){
            if(flightRefer.getQuery().getOriginPlace().equals(String.valueOf(flightRefer.getPlaces().get(c).getId()))){
                 originCode=flightRefer.getPlaces().get(c).getCode();
                 originName=flightRefer.getPlaces().get(c).getName();

            }
            if(flightRefer.getQuery().getDestinationPlace().equals(String.valueOf(flightRefer.getPlaces().get(c).getId()))){
                destCode=flightRefer.getPlaces().get(c).getCode();
                destName=flightRefer.getPlaces().get(c).getName();

            }
        }

        totalpass=flightRefer.getQuery().getAdults()+flightRefer.getQuery().getChildren()+flightRefer.getQuery().getInfants();
       // currenySymbol=flightRefer.getCurrencies().get(0).getSymbol();

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {

           Picasso.with(context).load(String.valueOf(oImageUrl.get(position))).into(holder.oLogo);
           holder.getoDepartureTime().setText(oDepartOnlyTime.get(position));
           holder.oArrivalTime.setText(oArrivalOnlyTime.get(position));
           holder.oDepartureCode.setText(originCode);
           holder.oArrivalCode.setText(destCode);
           holder.oStop.setText(String.valueOf(ostop.get(position)));
           Picasso.with(context).load(String.valueOf(iImageUrl.get(position))).into(holder.iLogo);
           holder.iDepartureTime.setText(iDepartOnlyTime.get(position));
           holder.iArrivaltime.setText(iArrivalOnlyTime.get(position));
           holder.iDepartureCode.setText(destCode);
           holder.iArrivalCode.setText(originCode);
           holder.iStop.setText(String.valueOf(istop.get(position)));
           holder.totalPassenger.setText(String.valueOf(totalpass));
           holder.currencySymbol.setText(currenySymbol);
           holder.price.setText(String.valueOf(price.get(position)));
           holder.out_depart_name.setText(originName);
           holder.out_arrival_name.setText(destName);
           holder.in_depart_name.setText(destName);
           holder.in_arrival_name.setText(originName);
//           int odurationHour=(oduration.get(position))/60;
//           int odurationMin=(oduration.get(position))%60;
//           int idurationHour=(iduration.get(position))/60;
//           int idurationMin=(iduration.get(position))%60;
           holder.out_time.setText(String.valueOf(oduration.get(position)));
           holder.in_time.setText(String.valueOf(iduration.get(position)));
    }



    @Override
    public int getItemCount() {
        return 5;
    }


}
