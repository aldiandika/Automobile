package com.example.aldiandika.automobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act_repair1 extends AppCompatActivity {

    Button toDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair1);

        toDetail = (Button) findViewById(R.id.toDetail);
    }

    public void keDua(View view){
        Intent intent = new Intent(this,Act_repair2.class);
        startActivity(intent);
    }
}
