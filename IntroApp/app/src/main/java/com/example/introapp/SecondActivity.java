package com.example.introapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
TextView id, phone;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    id =findViewById(R.id.videoId);
    phone=findViewById(R.id.phone);
    String Videoid=getIntent().getExtras().getString("id");
    int ph=getIntent().getExtras().getInt("ph");
    id.setText(Videoid);
    phone.setText(String.valueOf(ph));


    }
}
