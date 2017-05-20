package com.example.aldiandika.automobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class Act_garage extends AppCompatActivity {

    RecyclerView recyclerViewGar;
    RecyclerView.LayoutManager layoutManagerGar;
    RecyclerView.Adapter adapterGar;
    View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);

        decorView = getWindow().getDecorView();

        recyclerViewGar = (RecyclerView) findViewById(R.id.list_garage);

        layoutManagerGar = new LinearLayoutManager(this);
        recyclerViewGar.setLayoutManager(layoutManagerGar);

        adapterGar = new RecyclerAdapterGar();
        recyclerViewGar.setAdapter(adapterGar);
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
