package com.example.aldiandika.automobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Act_home extends AppCompatActivity {

    View decorView;
    LinearLayout btn_repair;
//    RecyclerView recyclerViewH;
//    RecyclerView.LayoutManager layoutManagerH;
//    RecyclerView.Adapter adapterH;
    ImageView direk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_home);

        decorView = getWindow().getDecorView();

        btn_repair = (LinearLayout) findViewById(R.id.btn_repair);
//        direk = (ImageView) findViewById(R.id.direk);

//        recyclerViewH = (RecyclerView) findViewById(R.id.tampil);
//
//        layoutManagerH = new LinearLayoutManager(this);
//        recyclerViewH.setLayoutManager(layoutManagerH);
//
//        adapterH = new RecyclerAdapterH();
//        recyclerViewH.setAdapter(adapterH);


    }

    public void toRepair(View view){
        Intent intent = new Intent(this,Act_repairCar.class);
        startActivity(intent);
    }

    public void toDirect(View view){
        Intent intent = new Intent(this,Act_direct.class);
        startActivity(intent);
    }

    public void toGarage(View view){
        Intent intent = new Intent(this,Act_garage.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
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

    //Bikin baru
}
