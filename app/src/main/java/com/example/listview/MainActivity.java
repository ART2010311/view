package com.example.listview;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
String[] country={"India","Nepal","China","Bangladesh","NewZealand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ListView l=findViewById(R.id.lv);
        ArrayAdapter<String> view= new ArrayAdapter<>(this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,country);
        l.setAdapter(view);
    }
}