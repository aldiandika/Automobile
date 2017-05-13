package com.example.aldiandika.automobile;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Act_repair1 extends AppCompatActivity {

    Button toDetail;
    RecyclerView recyclerViewA;
    RecyclerView.LayoutManager layoutManagerA;
    RecyclerView.Adapter adapterA;
    View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair1);

        decorView = getWindow().getDecorView();

        toDetail = (Button) findViewById(R.id.toDetail);

        recyclerViewA = (RecyclerView) findViewById(R.id.list1);

        layoutManagerA = new LinearLayoutManager(this);
        recyclerViewA.setLayoutManager(layoutManagerA);

        adapterA = new RecyclerAdapterA();
        recyclerViewA.setAdapter(adapterA);

    }

    public void keDua(View view){
        Intent intent = new Intent(this,Act_repair2.class);
        startActivity(intent);
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
