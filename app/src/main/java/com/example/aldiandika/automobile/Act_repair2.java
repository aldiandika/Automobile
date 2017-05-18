package com.example.aldiandika.automobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class Act_repair2 extends AppCompatActivity {

    Button toSummary;
    RecyclerView recyclerViewB;
    RecyclerView.LayoutManager layoutManagerB;
    RecyclerView.Adapter adapterB;
    View decorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair2);

        decorView = getWindow().getDecorView();

        toSummary = (Button) findViewById(R.id.toSummary);

        recyclerViewB = (RecyclerView) findViewById(R.id.list2);

        layoutManagerB = new LinearLayoutManager(this);
        recyclerViewB.setLayoutManager(layoutManagerB);

        adapterB = new RecyclerAdapterB();
        recyclerViewB.setAdapter(adapterB);
    }

    public void keTiga(View view){
        Intent intent = new Intent(this,Act_repair3.class);
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