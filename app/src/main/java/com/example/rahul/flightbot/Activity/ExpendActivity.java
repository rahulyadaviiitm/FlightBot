package com.example.rahul.flightbot.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rahul.flightbot.R;

import org.w3c.dom.Text;

public class ExpendActivity extends AppCompatActivity {
    private String lastmessage="From";
    TextView message;
    Button send;
    EditText entermessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expend);
        message=(TextView)findViewById(R.id.message);
        send=(Button)findViewById(R.id.btn_send);
        entermessage=(EditText)findViewById(R.id.ed_message);
        final Animation anim = AnimationUtils.loadAnimation(ExpendActivity.this, R.anim.scale);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current= entermessage.getText().toString();
                if(current.isEmpty()==false) {
                    String total = lastmessage + " \n " + current;
                    message.setText(total);
                    lastmessage = message.getText().toString();
                    entermessage.setText("");
                    message.startAnimation(anim);
                }
            }
        });



    }

}
