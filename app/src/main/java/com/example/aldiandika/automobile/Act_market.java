package com.example.aldiandika.automobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class Act_market extends AppCompatActivity {

    RecyclerView recyclerViewMar;
    RecyclerView.LayoutManager layoutManagerMar;
    RecyclerView.Adapter adapterMar;
    View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        decorView = getWindow().getDecorView();

        recyclerViewMar = (RecyclerView) findViewById(R.id.list_market);

        layoutManagerMar = new GridLayoutManager(getApplicationContext(), 2);
        recyclerViewMar.setLayoutManager(layoutManagerMar);

        adapterMar = new RecyclerAdapterMar();
        recyclerViewMar.setAdapter(adapterMar);
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
