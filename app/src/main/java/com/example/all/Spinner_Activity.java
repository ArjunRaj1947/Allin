package com.example.all;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Spinner_Activity extends AppCompatActivity {
    Spinner spinner_Country;
    ArrayList<String> arrName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner_Country=findViewById(R.id.spinner_country);

        arrName.add("Punjab");
        arrName.add("Himachal Pradesh");
        arrName.add("Haryana");
        arrName.add("Rajsthan");
        arrName.add("Utter Pradesh");
        arrName.add("West Bangle");

       ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,arrName);
       spinner_Country.setAdapter(adapter);


    }
}