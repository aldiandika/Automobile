package com.example.aldiandika.automobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act_repair2 extends AppCompatActivity {

    Button toSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair2);

        toSummary = (Button) findViewById(R.id.toSummary);
    }

    public void keTiga(View view){
        Intent intent = new Intent(this,Act_repair3.class);
        startActivity(intent);
    }
}
