package com.example.all;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class SwipeRefreshLayout_Activity extends AppCompatActivity {
    SwipeRefreshLayout swipeRefreshLayout;
    TextView txt_srl;
    WebView web_v;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swip_refresh_layout);

        swipeRefreshLayout=findViewById(R.id.swipeRefreshLayout);
        txt_srl=findViewById(R.id.txt_srp);
        web_v=findViewById(R.id.web_v);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                txt_srl.setText("Welcome");
                swipeRefreshLayout.setRefreshing(false);
                web_v.loadUrl("https://www.flipkart.com/");

            }
        });


    }
}