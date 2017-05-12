package com.example.aldiandika.automobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act_repair3 extends AppCompatActivity {

    Button submitRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair3);

        submitRequest = (Button) findViewById(R.id.submitRequest);
    }

    public void keEmpat(View view){
        Intent intent = new Intent(this,Act_repair4.class);
        startActivity(intent);
    }
}
