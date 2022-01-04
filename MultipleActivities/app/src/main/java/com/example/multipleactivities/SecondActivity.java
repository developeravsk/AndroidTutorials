package com.example.multipleactivities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView parcel, phone;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        parcel=findViewById(R.id.parcel);
        phone=findViewById(R.id.phone);

        String par=getIntent().getExtras().getString("id");
        int ph=getIntent().getExtras().getInt("ph");

        parcel.setText(par);
        phone.setText(ph+"");
    }
}
