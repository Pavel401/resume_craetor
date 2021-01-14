package com.pavel.resumecreator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class details_page extends AppCompatActivity implements View.OnClickListener {
    public CardView card1, card2, card3, card4, card5, card6, card7, card8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Window window = details_page.this.getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(ContextCompat.getColor(details_page.this, R.color.colorAccent));

        super.onCreate(savedInstanceState);
        //Codes for center toolbar
        setContentView(R.layout.activity_details_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);


        card1 = (CardView) findViewById(R.id.c1);
        card2 = (CardView) findViewById(R.id.c2);
        card3 = (CardView) findViewById(R.id.c3);
        card4 = (CardView) findViewById(R.id.c4);
        card5 = (CardView) findViewById(R.id.c5);
        card6 = (CardView) findViewById(R.id.c6);
        card7 = (CardView) findViewById(R.id.c7);
        card8 = (CardView) findViewById(R.id.c8);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.c1:
                i= new Intent(details_page.this,personal_details.class);
                startActivity(i);
                break;
            case R.id.c2:
                i= new Intent(details_page.this,Education_details.class);
                startActivity(i);
                break;
            case R.id.c3:
                i=new Intent(details_page.this,Experience.class);
                startActivity(i);
                break;
            case R.id.c4:
                i=new Intent(details_page.this,Skills.class);
                startActivity(i);
                break;
            case R.id.c5:
                i=new Intent(details_page.this,Objective.class);
                startActivity(i);
                break;
            case R.id.c6:
                i=new Intent(details_page.this,References.class);
                startActivity(i);
                break;
            case R.id.c7:
                i=new Intent(details_page.this,Projects.class);
                startActivity(i);
                break;
            case R.id.c8:
                i=new Intent(details_page.this,Achievements.class);
                startActivity(i);
                break;


        }
    }
}