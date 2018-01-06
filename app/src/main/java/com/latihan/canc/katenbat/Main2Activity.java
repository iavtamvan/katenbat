package com.latihan.canc.katenbat;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//import com.google.android.gms.ads.AdListener;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.InterstitialAd;
//
//public class Main2Activity extends AppCompatActivity {
//
//    private InterstitialAd interstitial;
//
//    private InterstitialAd mInterstitialAd;
//    private boolean loadingIklan=true;
//    private Integer hitung=0;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//        getSupportActionBar().hide();
//
////        loadInterstitial();
////
////        AdView adView = (AdView)this.findViewById(R.id.adView);
////        AdRequest adRequest = new AdRequest.Builder().build();
////        adView.loadAd(adRequest);
////
////        AdView mAdView1 = (AdView) findViewById(R.id.adView1);
////        AdRequest adRequest1 = new AdRequest.Builder().build();
////        mAdView1.loadAd(adRequest1);
////
////        AdView mAdView2 = (AdView) findViewById(R.id.adView2);
////        AdRequest adRequest2 = new AdRequest.Builder().build();
////        mAdView2.loadAd(adRequest2);
////
////        AdView mAdView3 = (AdView) findViewById(R.id.adView3);
////        AdRequest adRequest3 = new AdRequest.Builder().build();
////        mAdView3.loadAd(adRequest3);
////
////        AdView mAdView4 = (AdView) findViewById(R.id.adView4);
////        AdRequest adRequest4 = new AdRequest.Builder().build();
////        mAdView4.loadAd(adRequest4);
////
////        AdView mAdView5 = (AdView) findViewById(R.id.adView5);
////        AdRequest adRequest5 = new AdRequest.Builder().build();
////        mAdView5.loadAd(adRequest5);
//
//
//        interstitial = new InterstitialAd(this);
//        interstitial.setAdUnitId(getResources().getString(R.string.interstitial_ad_unit_id));
//        AdRequest adRequest21 = new AdRequest.Builder().build();
//        interstitial.loadAd(adRequest21);
//
//        interstitial.setAdListener(new AdListener() {
//            public void onAdLoaded() {
//                displayInterstitial();
//            }
//        });
//
//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                displayInterstitial();
//            }
//        });
//    }
//
//    public void displayInterstitial() {
//        if (interstitial.isLoaded()) {
//            interstitial.show();
//        }
//    }
//
////    private void loadInterstitial() {
////        hitung++;
////        if (loadingIklan){
////            mInterstitialAd = new InterstitialAd(this);
////            mInterstitialAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
////            AdRequest adRequest = new AdRequest.Builder()
////                    .setRequestAgent("android_studio:ad_template").build();
////            mInterstitialAd.loadAd(adRequest);
////            loadingIklan=false;
////        }
////        if (hitung%5==0){
////            if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
////                mInterstitialAd.show();
////                loadingIklan=true;
////            }
////        }
////    }
//}


import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class Main2Activity extends AppCompatActivity {


    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        Button fdf= (Button) findViewById(R.id.button);
        fdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muat();

                reload();
            }
        });
    }


    private void reload() {
        new CountDownTimer(10000, 1000) {
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
            }


        }.start();
    }



    private void muat() {
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId("ca-app-pub-9199213552474414/4209059208");
        AdRequest adRequest21 = new AdRequest.Builder().build();
        interstitial.loadAd(adRequest21);

        interstitial.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                muat();
                super.onAdClosed();
            }

            @Override
            public void onAdOpened() {
                reload();
                super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                displayInterstitial();
                super.onAdLoaded();
            }
        });
        displayInterstitial();


    }
    public void displayInterstitial() {
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
