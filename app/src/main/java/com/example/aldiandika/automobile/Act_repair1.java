package com.example.aldiandika.automobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Act_repair1 extends AppCompatActivity {

    Button toDetail;
    RecyclerView recyclerViewA;
    RecyclerView.LayoutManager layoutManagerA;
    RecyclerView.Adapter adapterA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repair1);

        toDetail = (Button) findViewById(R.id.toDetail);

        recyclerViewA = (RecyclerView) findViewById(R.id.list1);

        layoutManagerA = new LinearLayoutManager(this);
        recyclerViewA.setLayoutManager(layoutManagerA);

        adapterA = new RecyclerAdapterA();
        recyclerViewA.setAdapter(adapterA);

    }

    public void keDua(View view){
        Intent intent = new Intent(this,Act_repair2.class);
        startActivity(intent);
    }
}
