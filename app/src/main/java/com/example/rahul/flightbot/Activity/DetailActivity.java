package com.example.rahul.flightbot.Activity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.rahul.flightbot.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    RelativeLayout r1,r2;
    int one=1;
    int two=2;
    TextView pass, spass;
    TextView npass,nnpass;
    LinearLayout detail;
    TextView cancel,done,number,dob;
    EditText name,email,phone;
    String pname,pemail,pphone;
    private Calendar calendar;
    private int year, month, day;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        r1=(RelativeLayout)findViewById(R.id.relative);
        r2=(RelativeLayout)findViewById(R.id.rrelative);
        npass=(TextView)findViewById(R.id.npassenger);
        nnpass=(TextView)findViewById(R.id.nnpassenger);
        detail=(LinearLayout)findViewById(R.id.pass_detail);
        LayoutInflater inflater = (LayoutInflater)DetailActivity.this.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        final View view = inflater.inflate(R.layout.passengar_detail, null, false);
        cancel=(TextView)view.findViewById(R.id.detail_cancel);
        number=(TextView)view.findViewById(R.id.passenger_number);
        done=(TextView)view.findViewById(R.id.detail_done);
        name=(EditText)view.findViewById(R.id.ed_name);
        email=(EditText)view.findViewById(R.id.ed_email);
        phone=(EditText)view.findViewById(R.id.ed_phone);
        dob=(TextView)view.findViewById(R.id.txt_dob);
        spinner=(Spinner)view.findViewById(R.id.spinner);
        List list = new ArrayList();
        list.add("Male");
        list.add("Female");
        ArrayAdapter dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detail.addView(view);

            }
        });
        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                showDialog(999);
            }
        });
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pname=name.getText().toString();
                pemail=email.getText().toString();
                pphone=phone.getText().toString();
                detail.removeView(view);
                npass.setText(pname);
            }
        });

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detail.addView(view);
        }
        });


//        pass=(TextView)findViewById(R.id.pass1);
//        spass=(TextView)findViewById(R.id.pass2);
//        Intent i=getIntent();
//        if(i.getStringExtra("name")!=null){
//            int num=i.getIntExtra("number", 0);
//            if(num==1){
//                String  pasname=i.getStringExtra("name");
//                pass.setText(pasname);
//                npass.setVisibility(View.INVISIBLE);
//
//            }
//
//            if(num==2){
//                String  pasname=i.getStringExtra("name");
//                spass.setText(pasname);
//                nnpass.setVisibility(View.INVISIBLE);
//            }
//
//
//        }

    }
    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this, myDateListener, year, month, day);
        }
        return null;
    }
    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            showDate(arg1, arg2+1, arg3);
        }
    };

    private void showDate(int year, int month, int day) {
        dob.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }

}
