package com.bryan.front_backconnectiontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    private Button getButton;
    private TextView getInfo;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getButton = findViewById(R.id.button);
        getInfo = findViewById(R.id.textView);

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getButton.setText("Received Data");
                getData();
                Toast.makeText(MainActivity.this, "Get Data From Server", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void getData(){
        String data = "";
        String getUrl = "http://127.0.0.1:8000";
        OkHttpClient okHttpClient = new OkHttpClient();
    }

}