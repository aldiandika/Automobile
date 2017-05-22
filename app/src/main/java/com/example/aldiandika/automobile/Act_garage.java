package com.example.aldiandika.automobile;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

public class Act_garage extends AppCompatActivity {

    RecyclerView recyclerViewGar;
    RecyclerView.LayoutManager layoutManagerGar;
    RecyclerView.Adapter adapterGar;
    View decorView;
    ImageButton navi_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.layout_action_garage);

        navi_back = (ImageButton)findViewById(R.id.navi_back);

        decorView = getWindow().getDecorView();

        recyclerViewGar = (RecyclerView) findViewById(R.id.list_garage);

        layoutManagerGar = new LinearLayoutManager(this);
        recyclerViewGar.setLayoutManager(layoutManagerGar);

        adapterGar = new RecyclerAdapterGar();
        recyclerViewGar.setAdapter(adapterGar);
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
