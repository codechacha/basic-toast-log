package com.example.xyz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "onCreate: activity가 실행되었습니다.");
    }

    void onButtonClick(View v) {
        Intent intent = new Intent(this, SubActivity01.class);
        startActivity(intent);

        Log.d(TAG, "onButtonClick: SubActivity01을 실행시켰습니다.");
    }
}
