package com.example.aldiandika.automobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView yes;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            yes.setVisibility(View.GONE);
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_menu:
                    selectedFragment = Fragment_repair.newInstance();
                    break;
                case R.id.navigation_repair:
                    selectedFragment = Fragment_repair.newInstance();
                    break;
                case R.id.navigation_lubricant:
                    selectedFragment = Fragment_repair.newInstance();
                    break;
                case R.id.navigation_breakdown:
                    selectedFragment = Fragment_repair.newInstance();
                    break;
                case R.id.navigation_garage:
                    selectedFragment = Fragment_repair.newInstance();
                    break;
            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.content, selectedFragment);
            transaction.commit();
            return true;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = (TextView)findViewById(R.id.yes);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
