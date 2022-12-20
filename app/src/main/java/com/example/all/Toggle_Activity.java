package com.example.all;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Toggle_Activity extends AppCompatActivity {

    Button toggle_act_back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle);

        toggle_act_back_btn=findViewById(R.id.toggle_act_back_btn);

        toggle_act_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Toggle_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}