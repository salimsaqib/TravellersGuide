package com.example.saqib.travellersguide;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "GOTHIC.TTF");
        TextView textView;
        textView = (TextView) findViewById(R.id.ExploreButton);
        textView.setTypeface(typeFace);
    }

    public void onClickplaygame(View view){

        Intent intent = new Intent(MainActivity.this,playgame.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void onClickExplore(View view){

        Intent intent = new Intent(MainActivity.this,Notloggenin.class);
        //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    //gg
}





