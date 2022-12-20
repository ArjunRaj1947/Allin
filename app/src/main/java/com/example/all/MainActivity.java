package com.example.all;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_toast;
    Button btn_toggle;
    Button btn_checkBox;
    Button btn_radio;
    Button btn_alert;
    Button lst;
    Button btn_spinner;
    Button btn_autoCom;
    Button btn_webView;
    Button btn_ratting;
    Button btn_seekBar;
    Button btn_datePicker;
    Button btn_timePicker;
    Button btn_progressBar;
    Button btn_recycleView;
    Button btn_viewPager;
    Button btn_swipeRefreshLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_toast=findViewById(R.id.btn_toast);
        btn_toggle=findViewById(R.id.btn_toggle);
        btn_checkBox=findViewById(R.id.btn_checkBox);
        btn_radio=findViewById(R.id.btn_radio);
        btn_alert=findViewById(R.id.btn_alert);
        lst=findViewById(R.id.lst);
        btn_spinner=findViewById(R.id.btn_spinner);
        btn_autoCom=findViewById(R.id.btn_autoCom);
        btn_webView=findViewById(R.id.btn_webView);
        btn_ratting=findViewById(R.id.btn_ratting);
        btn_seekBar =findViewById(R.id.btn_seekbar);
        btn_datePicker=findViewById(R.id.btn_datePicker);
        btn_timePicker=findViewById(R.id.btn_timePicker);
        btn_progressBar=findViewById(R.id.btn_progressBar);
        btn_recycleView=findViewById(R.id.btn_recycleView);
        btn_viewPager=findViewById(R.id.btn_viewPager);
        btn_swipeRefreshLayout=findViewById(R.id.btn_swipeRefreshLayout);


        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SwipeRefreshLayout.class);
                startActivity(intent);

            }
        });

        btn_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Toggle_Activity.class);
                startActivity(intent);
            }
        });

        btn_checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,CheckBox_Activity.class);
                startActivity(intent);
            }
        });

        btn_radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Radio_Activity.class);
                startActivity(intent);
            }
        });
        btn_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Alert_Activity.class);
                startActivity(intent);
            }
        });
        lst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,ListView_Activity.class);
                startActivity(intent);
            }
        });
        btn_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Spinner_Activity.class);
                startActivity(intent);
            }
        });
        btn_autoCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,AutoComplete_Activity.class);
                startActivity(intent);
            }
        });
        btn_webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,webView_Activity.class);
                startActivity(intent);
            }
        });
        btn_ratting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RattingBar_Activity.class);
                startActivity(intent);
            }
        });
        btn_seekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,SeekBar_Activity.class);
                startActivity(intent);
            }
        });
        btn_datePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,DatePicker_Activity.class);
                startActivity(intent);
            }
        });

        btn_timePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,TimePicker_Activity.class);
                startActivity(intent);
            }
        });
        btn_progressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ProgressBar_Activity.class);
                startActivity(intent);
            }
        });
        btn_recycleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RecycleView_Activity.class);
                startActivity(intent);
            }
        });
        btn_viewPager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,ViewPager2_Activity.class);
                startActivity(intent);
            }
        });

        btn_swipeRefreshLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this, SwipeRefreshLayout_Activity.class);
                startActivity(intent);
            }
        });




    }

}