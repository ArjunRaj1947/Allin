package com.example.all;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class RattingBar_Activity extends AppCompatActivity {

    RatingBar ratingBar;
    Button rating_act_submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratting_bar);

        ratingBar = findViewById(R.id.ratingBar);
        rating_act_submit_btn=findViewById(R.id.rating_act_submit_btn);

        rating_act_submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String rating=String.valueOf(ratingBar.getRating());
                Toast.makeText(RattingBar_Activity.this,rating, Toast.LENGTH_SHORT).show();

            }
        });
    }
}