package com.example.rahul.flightbot.Activity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rahul.flightbot.Interface.GetAirportDetailsApi;
import com.example.rahul.flightbot.Interface.GetFlightDetailsApi;
import com.example.rahul.flightbot.R;
import com.example.rahul.flightbot.RecyclerAdapter;
import com.example.rahul.flightbot.model.AirportName;
import com.example.rahul.flightbot.model.FlightRefer;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.squareup.okhttp.OkHttpClient;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    String base_url = "http://partners.api.skyscanner.net/apiservices/autosuggest/v1.0/";
    String apikey = "an790354552793754474773992383118";
    private static final String[] AIRPORT = new String[] {
            "New Delhi", "Jaipur", "Jaitaran", "Jodhpur", "New Desk"
    };

    ImageView scyscanner;
    Button info,select,expand;
    LinearLayout layout;
    View view;
    TextView add_adult, add_child, add_infant, cancel, i_out_date, i_in_date;
    TextView count_adult, count_child, count_infant,b;
    TextView remove_adult, remove_child, remove_infant;
    int value_adult = 0, value_child = 0, value_infant = 0;
    private Interpolator interpolator;
    private static final String PACKAGE = "android.view.animation.";
    private static final String PACKAGE_V4 = "android.support.v4.view.animation.";
    private int duration = 500;
    String country, currency, locale,query;
    int adult, children, infants;
    private Calendar calendar;
    private int year, month, day;
    int id;
    private ViewPager viewPager;
    private MyViewPagerAdapter myViewPagerAdapter;
    private LinearLayout dotsLayout;
    private LinearLayout priceLayout;
    private TextView[] dots;
    private int[] layouts;
    private TextView[] price;
    String interpolatorName = "DecelerateInterpolator";
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    int limit=2;
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout) findViewById(R.id.layout_info);
        final AutoCompleteTextView i_from = (AutoCompleteTextView) findViewById(R.id.ed_from);
        i_from.setThreshold(2);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, airport_name);
//        i_from.setAdapter(adapter);
//        i_from.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                ac.execute(i_from.getText().toString());
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
        final List<String> airport_name =new ArrayList<>();
            country = "IN";
            currency = "INR";
            locale="en-GB";
            query=i_from.getText().toString();
            Retrofit retrofit = new Retrofit.Builder().baseUrl(base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(new OkHttpClient())
                    .build();
            GetAirportDetailsApi api = retrofit.create(GetAirportDetailsApi.class);
            Call<AirportName> response = api.getAirportList(country,currency,locale,query,apikey);
            response.enqueue(new Callback<AirportName>() {
                @Override
                public void onResponse(Response<AirportName> response) {

                    if (response == null) {
                        return;
                    }
                    AirportName airportName=response.body();


                  //  for(int i=0;i<airportName.getPlaces().size();i++){
                   //     airport_name.add(i,airportName.getPlaces().get(i).getPlaceName());
                 //   }
                }
                @Override
                public void onFailure(Throwable t) {
                  Toast.makeText(getApplicationContext(),"Error Occured",Toast.LENGTH_LONG).show();
                }
            });
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, airport_name);
            i_from.setAdapter(adapter);
        final AutoCompleteTextView i_to = (AutoCompleteTextView) findViewById(R.id.ed_to);
//        if(i_to.length()>1){
//            country = "IN";
//            currency = "INR";
//            locale="en-GB";
//            query=i_to.getText().toString();
//            Retrofit retrofit = new Retrofit.Builder().baseUrl(base_url)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .client(new OkHttpClient())
//                    .build();
//            GetAirportDetailsApi api = retrofit.create(GetAirportDetailsApi.class);
//            Call<AirportName> response = api.getAirportList(country,currency,locale,query,apikey);
//            response.enqueue(new Callback<AirportName>() {
//                @Override
//                public void onResponse(Response<AirportName> response) {
//
//                    if (response == null) {
//                        return;
//                    }
//                    AirportName airportName=response.body();
//
//
//                    for(int i=0;i<airportName.getPlaces().size();i++){
//                        airport_name.add(i,airportName.getPlaces().get(i).getPlaceName());
//                    }
//                }
//                @Override
//                public void onFailure(Throwable t) {
//
//                }
//            });
            ArrayAdapter<String> adapterr = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,AIRPORT);
           i_to.setAdapter(adapterr);
//        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        dotsLayout = (LinearLayout) findViewById(R.id.layoutDots);
        priceLayout=(LinearLayout)findViewById(R.id.layoutprice);
        i_out_date = (TextView) findViewById(R.id.out_date);
        i_in_date = (TextView) findViewById(R.id.in_date);
        i_out_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                id = 999;
                showDialog(999);

            }
        });
        i_in_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                id = 888;
                showDialog(888);

            }
        });
        LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.passenger_info, null, false);
        info = (Button) findViewById(R.id.btn_count);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.addView(view);
                DisplayMetrics metrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(metrics);
                layout.setTranslationY(metrics.heightPixels);

                try {
                    String path = findFullInterpolatorPath(interpolatorName);
                    if (path == null)
                        return;

                    interpolator = (Interpolator) Class.forName(path).newInstance();
                    layout.animate().setInterpolator(interpolator)
                            .setDuration(duration)
                            .setStartDelay(500)
                            .translationYBy(-metrics.heightPixels)
                            .start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }


            }
        });
        TextView cancel = (TextView) view.findViewById(R.id.txt_cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.removeView(view);
            }
        });
        add_adult = (TextView) view.findViewById(R.id.add_adult);
        remove_adult = (TextView) view.findViewById(R.id.remove_adult);
        count_adult = (TextView) view.findViewById(R.id.count_adult);

        add_adult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_adult++;
                count_adult.setText(String.valueOf(value_adult));

            }
        });
        remove_adult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value_adult > 0) {
                    value_adult--;
                    count_adult.setText(String.valueOf(value_adult));
                }
            }
        });
        add_child = (TextView) view.findViewById(R.id.add_child);
        remove_child = (TextView) view.findViewById(R.id.remove_child);
        count_child = (TextView) view.findViewById(R.id.count_child);
        add_child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_child++;
                count_child.setText(String.valueOf(value_child));

            }
        });
        remove_child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value_child > 0) {
                    value_child--;
                    count_child.setText(String.valueOf(value_child));
                }
            }
        });
        add_infant = (TextView) view.findViewById(R.id.add_infant);
        remove_infant = (TextView) view.findViewById(R.id.remove_infant);
        count_infant = (TextView) view.findViewById(R.id.count_infant);
        add_infant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_infant++;
                count_infant.setText(String.valueOf(value_infant));

            }
        });
        remove_infant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (value_infant > 0) {
                    value_infant--;
                    count_infant.setText(String.valueOf(value_infant));
                }
            }
        });


        scyscanner = (ImageView) view.findViewById(R.id.img_skyscanner);
        scyscanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layouts = new int[]{
                        R.layout.best_ticket_info,
                        R.layout.best_ticket_info,
                        R.layout.best_ticket_info,
                        R.layout.best_ticket_info,
                        R.layout.best_ticket_info};

                addBottomDots(0);
                addBottomPrice(0);
                myViewPagerAdapter = new MyViewPagerAdapter();
                viewPager.setAdapter(myViewPagerAdapter);
                viewPager.addOnPageChangeListener(viewPagerPageChangeListener);
                layout.removeView(view);
                Intent intent =new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("from",i_from.getText().toString());
                intent.putExtra("to",i_to.getText().toString());
                intent.putExtra("outDate",i_out_date.getText().toString());
                intent.putExtra("indate",i_in_date.getText().toString());
                startActivity(intent);



            }
        });
        select=(Button)findViewById(R.id.btn_selected);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                startActivity(intent);
            }
        });

        expand=(Button)findViewById(R.id.btn_expend);
        expand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ExpendActivity.class);
                startActivity(intent);
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void addBottomPrice(int currentPage) {
        price = new TextView[layouts.length];
        int  itemprice[]= new int[]{400,5665,588,632,886};
        int[] colorsActive = getResources().getIntArray(R.array.array_dot_active);
        int[] colorsInactive = getResources().getIntArray(R.array.array_dot_inactive);
        priceLayout.removeAllViews();
        for(int j=0;j<price.length;j++){
            price[j] = new TextView(this);
            price[j].setText(String.valueOf(itemprice[j]));
            price[j].setTextSize(20);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );

            params.setMargins(8, 0, 8, 0);
            price[j].setTextColor(colorsInactive[currentPage]);
            priceLayout.addView(price[j],params);


        }
        if (price.length > 0)
            price[currentPage].setTextColor(colorsActive[currentPage]);
    }

    private void addBottomDots(int currentPage) {
        dots = new TextView[layouts.length];

        int[] colorsActive = getResources().getIntArray(R.array.array_dot_active);
        int[] colorsInactive = getResources().getIntArray(R.array.array_dot_inactive);

        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(colorsInactive[currentPage]);
            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0)
            dots[currentPage].setTextColor(colorsActive[currentPage]);
    }

    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }

    //	viewpager change listener
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            addBottomDots(position);
            addBottomPrice(position);
            // changing the next button text 'NEXT' / 'GOT IT'
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };

    public class MyViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public MyViewPagerAdapter() {
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(layouts[position], container, false);
            container.addView(view);

            return view;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this, myDateListener, year, month, day);
        } else if (id == 888) {
            return new DatePickerDialog(this, myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
            if (id == 999) {
                showDate(arg1, arg2 + 1, arg3);
            } else if (id == 888) {
                InDate(arg1, arg2 + 1, arg3);
            }
        }
    };

    private void showDate(int year, int month, int day) {
        i_out_date.setText(new StringBuilder().append(year).append("-")
                .append(String.format("%02d", month)).append("-").append(String.format("%02d", day)));
    }

    private void InDate(int year, int month, int day) {
        i_in_date.setText(new StringBuilder().append(year).append("-")
                .append(String.format("%02d", month)).append("-").append(String.format("%02d", day)));
    }

    String findFullInterpolatorPath(String className) {
        return PACKAGE + className;
    }

    @Override
    public void onStart() {
        super.onStart();
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.rahul.flightbot/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.rahul.flightbot/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
