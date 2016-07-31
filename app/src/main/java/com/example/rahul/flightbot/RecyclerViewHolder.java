package com.example.rahul.flightbot;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rahul on 15-06-2016.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView oDepartureTime,oArrivalTime,oDepartureCode,oArrivalCode,oStop;
    TextView iDepartureTime,iArrivaltime,iDepartureCode,iArrivalCode,iStop;
    ImageView oLogo,iLogo,oInfo,iInfo;
    TextView totalPassenger,currencySymbol,price,select,out_time,in_time;
    TextView out_depart_name,out_arrival_name,in_depart_name,in_arrival_name;
    public RecyclerViewHolder(View itemView) {
        super(itemView);
        oDepartureTime = (TextView) itemView.findViewById(R.id.out_depart_time);
        oArrivalTime = (TextView) itemView.findViewById(R.id.out_arrival_time);
        oDepartureCode = (TextView) itemView.findViewById(R.id.out_depart_code);
        oArrivalCode = (TextView) itemView.findViewById(R.id.out_arrival_code);
        oStop = (TextView) itemView.findViewById(R.id.out_stop);
        iDepartureTime = (TextView) itemView.findViewById(R.id.in_depart_time);
        iArrivaltime = (TextView) itemView.findViewById(R.id.in_arrival_time);
        iDepartureCode = (TextView) itemView.findViewById(R.id.in_depart_code);
        iArrivalCode = (TextView) itemView.findViewById(R.id.in_arrival_code);
        iStop = (TextView) itemView.findViewById(R.id.in_stop);
        oLogo=(ImageView)itemView.findViewById(R.id.out_img_logo);
        iLogo=(ImageView)itemView.findViewById(R.id.in_img_logo);
        oInfo=(ImageView)itemView.findViewById(R.id.out_info);
        iInfo=(ImageView)itemView.findViewById(R.id.in_info);
        totalPassenger = (TextView) itemView.findViewById(R.id.passenger_count);
        currencySymbol = (TextView) itemView.findViewById(R.id.currenct_symbol);
        price = (TextView) itemView.findViewById(R.id.total_price);
        select = (TextView) itemView.findViewById(R.id.txt_select);
        out_depart_name=(TextView)itemView.findViewById(R.id.out_depart_name);
        out_arrival_name=(TextView)itemView.findViewById(R.id.out_arrival_name);
        in_depart_name=(TextView)itemView.findViewById(R.id.in_depart_name);
        in_arrival_name=(TextView)itemView.findViewById(R.id.in_arrival_name);
        out_time=(TextView)itemView.findViewById(R.id.out_duration);
        in_time=(TextView)itemView.findViewById(R.id.in_duration);
    }

    public TextView getOut_time() {
        return out_time;
    }

    public void setOut_time(TextView out_time) {
        this.out_time = out_time;
    }

    public TextView getIn_time() {
        return in_time;
    }

    public void setIn_time(TextView in_time) {
        this.in_time = in_time;
    }

    public TextView getOut_depart_name() {
        return out_depart_name;
    }

    public void setOut_depart_name(TextView out_depart_name) {
        this.out_depart_name = out_depart_name;
    }

    public TextView getOut_arrival_name() {
        return out_arrival_name;
    }

    public void setOut_arrival_name(TextView out_arrival_name) {
        this.out_arrival_name = out_arrival_name;
    }

    public TextView getIn_depart_name() {
        return in_depart_name;
    }

    public void setIn_depart_name(TextView in_depart_name) {
        this.in_depart_name = in_depart_name;
    }

    public TextView getIn_arrival_name() {
        return in_arrival_name;
    }

    public void setIn_arrival_name(TextView in_arrival_name) {
        this.in_arrival_name = in_arrival_name;
    }

    public TextView getoDepartureTime() {
        return oDepartureTime;
    }

    public void setoDepartureTime(TextView oDepartureTime) {
        this.oDepartureTime = oDepartureTime;
    }

    public TextView getoArrivalTime() {
        return oArrivalTime;
    }

    public void setoArrivalTime(TextView oArrivalTime) {
        this.oArrivalTime = oArrivalTime;
    }

    public TextView getoDepartureCode() {
        return oDepartureCode;
    }

    public void setoDepartureCode(TextView oDepartureCode) {
        this.oDepartureCode = oDepartureCode;
    }

    public TextView getoArrivalCode() {
        return oArrivalCode;
    }

    public void setoArrivalCode(TextView oArrivalCode) {
        this.oArrivalCode = oArrivalCode;
    }

    public TextView getoStop() {
        return oStop;
    }

    public void setoStop(TextView oStop) {
        this.oStop = oStop;
    }

    public TextView getiDepartureTime() {
        return iDepartureTime;
    }

    public void setiDepartureTime(TextView iDepartureTime) {
        this.iDepartureTime = iDepartureTime;
    }

    public TextView getiArrivaltime() {
        return iArrivaltime;
    }

    public void setiArrivaltime(TextView iArrivaltime) {
        this.iArrivaltime = iArrivaltime;
    }

    public TextView getiDepartureCode() {
        return iDepartureCode;
    }

    public void setiDepartureCode(TextView iDepartureCode) {
        this.iDepartureCode = iDepartureCode;
    }

    public TextView getiArrivalCode() {
        return iArrivalCode;
    }

    public void setiArrivalCode(TextView iArrivalCode) {
        this.iArrivalCode = iArrivalCode;
    }

    public TextView getiStop() {
        return iStop;
    }

    public void setiStop(TextView iStop) {
        this.iStop = iStop;
    }

    public ImageView getoLogo() {
        return oLogo;
    }

    public void setoLogo(ImageView oLogo) {
        this.oLogo = oLogo;
    }

    public ImageView getiLogo() {
        return iLogo;
    }

    public void setiLogo(ImageView iLogo) {
        this.iLogo = iLogo;
    }

    public ImageView getoInfo() {
        return oInfo;
    }

    public void setoInfo(ImageView oInfo) {
        this.oInfo = oInfo;
    }

    public ImageView getiInfo() {
        return iInfo;
    }

    public void setiInfo(ImageView iInfo) {
        this.iInfo = iInfo;
    }

    public TextView getTotalPassenger() {
        return totalPassenger;
    }

    public void setTotalPassenger(TextView totalPassenger) {
        this.totalPassenger = totalPassenger;
    }

    public TextView getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(TextView currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public TextView getPrice() {
        return price;
    }

    public void setPrice(TextView price) {
        this.price = price;
    }

    public TextView getSelect() {
        return select;
    }

    public void setSelect(TextView select) {
        this.select = select;
    }
}
