package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("OnCreate","Started");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("OnStart","Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("OnResume","Started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("OnStop", "Started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("OnStop","Started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("OnRestart", "Started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("OnDestroy","Started");
    }
}