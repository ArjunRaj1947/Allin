package com.example.all;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListView_Activity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrName =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView=findViewById(R.id.listView);

        arrName.add("Rajesh");
        arrName.add("Manoj");
        arrName.add("Shubham");
        arrName.add("Amit");
        arrName.add("Monu");
        arrName.add("Sonu");
        arrName.add("Ravi");
        arrName.add("Rakesh");
        arrName.add("Sumit");
        arrName.add("Sachin");
        arrName.add("Siraj");
        arrName.add("Lakshay");
        arrName.add("Modi");
        arrName.add("Rahul");
        arrName.add("Kejriwal");
        arrName.add("Salman");

        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,arrName);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Toast.makeText(ListView_Activity.this, "Rajesh is clicked", Toast.LENGTH_SHORT).show();
                }
                if (i == 1) {
                    Toast.makeText(ListView_Activity.this, "Manoj is clicked", Toast.LENGTH_SHORT).show();
                }
                if(i==2){
                    Toast.makeText(ListView_Activity.this, "Shubham is clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}