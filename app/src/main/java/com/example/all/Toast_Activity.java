package com.example.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Toast_Activity extends AppCompatActivity {
    Button toast_act_submit_btn,toast_act_back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        toast_act_submit_btn=findViewById(R.id.toast_act_submit_btn);
        toast_act_back_button=findViewById(R.id.toast_act_back_btn);

        toast_act_submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Toast_Activity.this, "Submit button is clicked", Toast.LENGTH_SHORT).show();
            }
        });

        toast_act_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Toast_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}