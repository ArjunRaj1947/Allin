package com.example.all;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class AutoComplete_Activity extends AppCompatActivity {
    AutoCompleteTextView auto_com_view;
    ArrayList<String> arrAuto =new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);

        auto_com_view=findViewById(R.id.auto_com_view);

        arrAuto.add("C");
        arrAuto.add("C++");
        arrAuto.add("Java");
        arrAuto.add("Php");
        arrAuto.add("Python");
        arrAuto.add(".Net");
        arrAuto.add("JavaScript");

        ArrayAdapter<String> adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrAuto);
        auto_com_view.setAdapter(adapter);
        auto_com_view.setThreshold(1);
    }
}