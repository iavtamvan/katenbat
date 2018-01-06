package com.latihan.canc.katenbat;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private InterstitialAd interstitial;
    AdView mAdView,mAdView1,mAdView2,mAdView3,mAdView4,mAdView5,mAdView6,mAdView7,mAdView8,mAdView9,mAdView10,mAdView11,mAdView12,mAdView13,mAdView14,mAdView15,mAdView16,mAdView17,mAdView18,mAdView19;
    AdRequest adRequest,adRequest1,adRequest2,adRequest3,adRequest4,adRequest5,adRequest6,adRequest7,adRequest8,adRequest9,adRequest10,adRequest11,adRequest12,adRequest13,adRequest14,adRequest15,adRequest16,adRequest17,adRequest18,adRequest19;

    LinearLayout div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

         mAdView = (AdView) findViewById(R.id.adView);
        adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

       mAdView1 = (AdView) findViewById(R.id.adView1);
    adRequest1 = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest1);

       mAdView2 = (AdView) findViewById(R.id.adView2);
       adRequest2 = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest2);

     mAdView3 = (AdView) findViewById(R.id.adView3);
        adRequest3 = new AdRequest.Builder().build();
        mAdView3.loadAd(adRequest3);

         mAdView4 = (AdView) findViewById(R.id.adView4);
         adRequest4 = new AdRequest.Builder().build();
        mAdView4.loadAd(adRequest4);

       mAdView5 = (AdView) findViewById(R.id.adView5);
       adRequest5 = new AdRequest.Builder().build();
        mAdView5.loadAd(adRequest5);

         mAdView6 = (AdView) findViewById(R.id.adView6);
         adRequest6 = new AdRequest.Builder().build();
        mAdView6.loadAd(adRequest6);

        mAdView7 = (AdView) findViewById(R.id.adView7);
         adRequest7 = new AdRequest.Builder().build();
        mAdView7.loadAd(adRequest7);

         mAdView8 = (AdView) findViewById(R.id.adView8);
         adRequest8 = new AdRequest.Builder().build();
        mAdView8.loadAd(adRequest8);

         mAdView9 = (AdView) findViewById(R.id.adView9);
         adRequest9 = new AdRequest.Builder().build();
        mAdView9.loadAd(adRequest9);

        mAdView10 = (AdView) findViewById(R.id.adView10);
        adRequest10 = new AdRequest.Builder().build();
        mAdView10.loadAd(adRequest10);

        mAdView11 = (AdView) findViewById(R.id.adView11);
        adRequest11 = new AdRequest.Builder().build();
        mAdView11.loadAd(adRequest11);

        mAdView12 = (AdView) findViewById(R.id.adView12);
        adRequest12 = new AdRequest.Builder().build();
        mAdView12.loadAd(adRequest12);

        mAdView13 = (AdView) findViewById(R.id.adView13);
        adRequest13 = new AdRequest.Builder().build();
        mAdView13.loadAd(adRequest13);

        mAdView14 = (AdView) findViewById(R.id.adView14);
        adRequest14 = new AdRequest.Builder().build();
        mAdView14.loadAd(adRequest14);

        mAdView15 = (AdView) findViewById(R.id.adView15);
        adRequest15 = new AdRequest.Builder().build();
        mAdView15.loadAd(adRequest15);

        mAdView16 = (AdView) findViewById(R.id.adView16);
        adRequest16 = new AdRequest.Builder().build();
        mAdView16.loadAd(adRequest16);

        mAdView17 = (AdView) findViewById(R.id.adView17);
        adRequest17 = new AdRequest.Builder().build();
        mAdView17.loadAd(adRequest17);

        mAdView18 = (AdView) findViewById(R.id.adView18);
        adRequest18 = new AdRequest.Builder().build();
        mAdView18.loadAd(adRequest18);

        mAdView19 = (AdView) findViewById(R.id.adView19);
        adRequest19 = new AdRequest.Builder().build();
        mAdView19.loadAd(adRequest19);

        final AdView mAdView10 = (AdView) findViewById(R.id.adView10);
        final AdRequest adRequest10 = new AdRequest.Builder().build();
        mAdView10.loadAd(adRequest10);

        final AdView mAdView11 = (AdView) findViewById(R.id.adView11);
        final AdRequest adRequest11 = new AdRequest.Builder().build();
        mAdView11.loadAd(adRequest11);

        final AdView mAdView12 = (AdView) findViewById(R.id.adView12);
        final AdRequest adRequest12 = new AdRequest.Builder().build();
        mAdView12.loadAd(adRequest12);

        final AdView mAdView13 = (AdView) findViewById(R.id.adView13);
        final AdRequest adRequest13 = new AdRequest.Builder().build();
        mAdView13.loadAd(adRequest13);

        final AdView mAdView14 = (AdView) findViewById(R.id.adView14);
        final AdRequest adRequest14 = new AdRequest.Builder().build();
        mAdView14.loadAd(adRequest14);

        final AdView mAdView15 = (AdView) findViewById(R.id.adView15);
        final AdRequest adRequest15 = new AdRequest.Builder().build();
        mAdView15.loadAd(adRequest15);

        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId(getResources().getString(R.string.interstitial_ad_unit_id));
        AdRequest adRequest21 = new AdRequest.Builder().build();
        interstitial.loadAd(adRequest21);



        TextView banner1 = (TextView) findViewById(R.id.toMarket);
        banner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Banner.class));
            }
        });

        TextView load = (TextView) findViewById(R.id.toload);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reload();



//                mAdView10.loadAd(adRequest10);
//                mAdView11.loadAd(adRequest11);
//                mAdView12.loadAd(adRequest12);
//                mAdView13.loadAd(adRequest13);
//                mAdView14.loadAd(adRequest14);
//                mAdView15.loadAd(adRequest15);

            }
        });

        TextView intersial = (TextView) findViewById(R.id.intersial);
        intersial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            }
        });

    }

    private void getdata() {
        for (int i=0; i<10; i++){
            LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View addView = layoutInflater.inflate(R.layout.row_banner1, null);
        }
    }

    private void reload() {

        new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long l) {
                TextView nn  = (TextView) findViewById(R.id.nilai);
                nn.setText("nilai" + (l/1000));
            }

            @Override
            public void onFinish() {

                TextView nn = (TextView) findViewById(R.id.nilai);
                nn.setText("memulai Ulang");
                muat();
                mula();

            }


        }.start();

    }

    private void muat() {
        mAdView.loadAd(adRequest);
        mAdView1.loadAd(adRequest1);
        mAdView2.loadAd(adRequest2);
        mAdView3.loadAd(adRequest3);
        mAdView4.loadAd(adRequest4);
        mAdView5.loadAd(adRequest5);
        mAdView6.loadAd(adRequest6);
        mAdView7.loadAd(adRequest7);
        mAdView8.loadAd(adRequest8);
        mAdView9.loadAd(adRequest9);
        mAdView10.loadAd(adRequest10);
        mAdView11.loadAd(adRequest11);
        mAdView12.loadAd(adRequest12);
        mAdView13.loadAd(adRequest13);
        mAdView14.loadAd(adRequest14);
        mAdView15.loadAd(adRequest15);
        mAdView16.loadAd(adRequest16);
        mAdView17.loadAd(adRequest17);
        mAdView18.loadAd(adRequest18);
        mAdView19.loadAd(adRequest19);
    }

    private void mula() {

        new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long l) {
                TextView nn  = (TextView) findViewById(R.id.nilai);
                nn.setText("nilai" + (l/1000));
            }

            @Override
            public void onFinish() {

                TextView nn = (TextView) findViewById(R.id.nilai);
                nn.setText("memulai Ulang");
                muat();
                reload();

            }


        }.start();

    }
}
