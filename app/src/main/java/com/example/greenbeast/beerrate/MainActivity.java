package com.example.greenbeast.beerrate;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by GreenBeast on 10/26/2017.
 */

public class MainActivity extends AppCompatActivity {
   ImageButton trendingBtm,userBtm,locationBtm,settingsBtm;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trendingBtm = (ImageButton) findViewById(R.id.imageBtmtrending);
        userBtm = (ImageButton) findViewById(R.id.imageBtmuser);
        locationBtm = (ImageButton) findViewById(R.id.imageBtmlocation);
        settingsBtm = (ImageButton) findViewById(R.id.imageBtmSettings);

        trendingBtm.setOnClickListener(btTrending);
    }
        ImageButton.OnClickListener btTrending= new ImageButton.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, trending.class));
            }

        };


}
