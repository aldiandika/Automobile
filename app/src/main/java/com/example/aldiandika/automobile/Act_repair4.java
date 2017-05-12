package com.example.aldiandika.automobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Act_repair4 extends AppCompatActivity {

    ImageView btn_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair4);

        btn_menu = (ImageView) findViewById(R.id.btn_menu);
    }

    public void halMain(View view){
        Intent intent = new Intent(this,Act_home.class);
        startActivity(intent);
    }
}
