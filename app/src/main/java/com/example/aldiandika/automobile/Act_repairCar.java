package com.example.aldiandika.automobile;

import android.app.ActionBar;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Act_repairCar extends AppCompatActivity {

    View decorView;
    ImageButton navi_back;
    Button btn_atap, btn_depan, btn_kap;
    Button btn_kiriAtas,btn_kananAtas;
    ImageView atapMobil, kiriAtas, kananAtas, kapMobil, depanMobil;

    static int atap=0, kira=0, kana=0, kapo=0, depo=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair_car);
        decorView = getWindow().getDecorView();

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.layout_action_repair);

        navi_back = (ImageButton)findViewById(R.id.navi_back);
        btn_atap = (Button) findViewById(R.id.btn_atap);
        btn_depan = (Button) findViewById(R.id.btn_depan);
        btn_kap = (Button) findViewById(R.id.btn_kap);
        btn_kiriAtas = (Button) findViewById(R.id.btn_kiriAtas);
        btn_kananAtas = (Button) findViewById(R.id.btn_kananAtas);

        atapMobil = (ImageView) findViewById(R.id.atapMobil);
        kiriAtas = (ImageView) findViewById(R.id.kiriAtas);
        kananAtas = (ImageView) findViewById(R.id.kananAtas);
        kapMobil = (ImageView) findViewById(R.id.kapMobil);
        depanMobil = (ImageView) findViewById(R.id.depanMobil);


        atapMobil.setVisibility(View.INVISIBLE);
        kiriAtas.setVisibility(View.INVISIBLE);
        kananAtas.setVisibility(View.INVISIBLE);
        kapMobil.setVisibility(View.INVISIBLE);
        depanMobil.setVisibility(View.INVISIBLE);
    }

    public void tampilAtap(View view){
        if(atap == 0){
            atapMobil.setVisibility(View.VISIBLE);
            atap = 1;

        }
        else{
            atapMobil.setVisibility(View.INVISIBLE);
            atap = 0;
        }
//        Toast.makeText(this," "+atap,Toast.LENGTH_LONG).show();
    }

    public void tampilKap(View view){
        if(kapo == 0){
            kapMobil.setVisibility(View.VISIBLE);
            kapo = 1;

        }
        else{
            kapMobil.setVisibility(View.INVISIBLE);
            kapo = 0;
        }
//        Toast.makeText(this," "+kapo,Toast.LENGTH_LONG).show();
    }

    public void tampilDep(View view){
        if(depo == 0){
            depanMobil.setVisibility(View.VISIBLE);
            depo = 1;

        }
        else{
            depanMobil.setVisibility(View.INVISIBLE);
            depo = 0;
        }
//        Toast.makeText(this," "+depo,Toast.LENGTH_LONG).show();
    }

    public void tampilKan(View view){
        if(kana == 0){
            kananAtas.setVisibility(View.VISIBLE);
            kana = 1;

        }
        else{
            kananAtas.setVisibility(View.INVISIBLE);
            kana = 0;
        }
//        Toast.makeText(this," "+kana,Toast.LENGTH_LONG).show();
    }

    public void tampilKir(View view){
        if(kira == 0){
            kiriAtas.setVisibility(View.VISIBLE);
            kira = 1;

        }
        else{
            kiriAtas.setVisibility(View.INVISIBLE);
            kira = 0;
        }
//        Toast.makeText(this," "+kira,Toast.LENGTH_LONG).show();
    }

    public void backAct(View view){
        finish();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                            | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);}
    }
}
