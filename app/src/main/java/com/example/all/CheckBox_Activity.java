package com.example.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CheckBox_Activity extends AppCompatActivity {
    Button checkBox_act_back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkBox_act_back_btn=findViewById(R.id.checkBox_act_back_btn);



        checkBox_act_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(CheckBox_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}