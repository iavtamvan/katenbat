package com.latihan.canc.katenbat;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Banner extends AppCompatActivity {

    private LinearLayout div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        getSupportActionBar().hide();

//        prepareAds();

        final AdView mMarket = (AdView) findViewById(R.id.market);
        final AdRequest adMarket = new AdRequest.Builder().build();
        mMarket.loadAd(adMarket);

//        final AdView mMarket1 = (AdView) findViewById(R.id.market1);
//        final AdRequest adMarket1 = new AdRequest.Builder().build();
//        mMarket1.loadAd(adMarket1);
//
//        final AdView mMarket2 = (AdView) findViewById(R.id.market2);
//        final AdRequest adMarket2 = new AdRequest.Builder().build();
//        mMarket2.loadAd(adMarket2);
//
//        final AdView mMarket3 = (AdView) findViewById(R.id.market3);
//        final AdRequest adMarket3 = new AdRequest.Builder().build();
//        mMarket3.loadAd(adMarket3);
//
//        final AdView mMarket4 = (AdView) findViewById(R.id.market4);
//        final AdRequest adMarket4 = new AdRequest.Builder().build();
//        mMarket4.loadAd(adMarket4);
//
//        final AdView mMarket5 = (AdView) findViewById(R.id.market5);
//        final AdRequest adMarket5 = new AdRequest.Builder().build();
//        mMarket5.loadAd(adMarket5);
//
//        final AdView mMarket6 = (AdView) findViewById(R.id.market6);
//        final AdRequest adMarket6 = new AdRequest.Builder().build();
//        mMarket6.loadAd(adMarket6);
//
//        final AdView mMarket7 = (AdView) findViewById(R.id.market7);
//        final AdRequest adMarket7 = new AdRequest.Builder().build();
//        mMarket7.loadAd(adMarket7);
//
//        final AdView mMarket8 = (AdView) findViewById(R.id.market8);
//        final AdRequest adMarket8 = new AdRequest.Builder().build();
//        mMarket8.loadAd(adMarket8);
//
//        final AdView mMarket9 = (AdView) findViewById(R.id.market9);
//        final AdRequest adMarket9 = new AdRequest.Builder().build();
//        mMarket9.loadAd(adMarket9);

//        final AdView mMarket10 = (AdView) findViewById(R.id.market10);
//        final AdRequest adMarket10 = new AdRequest.Builder().build();
//        mMarket10.loadAd(adMarket10);

        LinearLayout reload = (LinearLayout)findViewById(R.id.reloadbanner);
        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMarket.loadAd(adMarket);
//                mMarket1.loadAd(adMarket1);
//                mMarket2.loadAd(adMarket2);
//                mMarket3.loadAd(adMarket3);
//                mMarket4.loadAd(adMarket4);
//                mMarket5.loadAd(adMarket5);
//                mMarket6.loadAd(adMarket6);
//                mMarket7.loadAd(adMarket7);
//                mMarket8.loadAd(adMarket8);
//                mMarket9.loadAd(adMarket9);

//                mMarket10.loadAd(adMarket10);
            }
        });
    }

//    private void prepareAds() {
//        for (int i = 0; i < 29; i++) {
//            LayoutInflater layoutInflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            final View addView = layoutInflater.inflate(R.layout.row_banner1, null);
//
//            final TextView tvLokasiJemput = (TextView) addView.findViewById(R.id.codeadmob);
//            tvLokasiJemput.setText("IKLAN");
//
//            div.addView(addView);
//        }
//
//    }
}
