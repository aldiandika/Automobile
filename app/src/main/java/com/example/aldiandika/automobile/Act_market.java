package com.example.aldiandika.automobile;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

public class Act_market extends AppCompatActivity {

    RecyclerView recyclerViewMar;
    RecyclerView.LayoutManager layoutManagerMar;
    RecyclerView.Adapter adapterMar;
    View decorView;
    ImageButton navi_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.layout_action_marketplace);

        navi_back = (ImageButton)findViewById(R.id.navi_back);

        decorView = getWindow().getDecorView();

        recyclerViewMar = (RecyclerView) findViewById(R.id.list_market);

        layoutManagerMar = new GridLayoutManager(getApplicationContext(), 2);
        recyclerViewMar.setLayoutManager(layoutManagerMar);

        adapterMar = new RecyclerAdapterMar();
        recyclerViewMar.setAdapter(adapterMar);
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
