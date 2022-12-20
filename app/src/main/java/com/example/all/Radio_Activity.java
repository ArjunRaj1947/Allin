package com.example.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Radio_Activity extends AppCompatActivity {
     Button radio_act_back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        radio_act_back_btn=findViewById(R.id.radio_act_back_btn);
        radio_act_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Radio_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}