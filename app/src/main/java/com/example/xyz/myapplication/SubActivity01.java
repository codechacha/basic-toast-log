package com.example.xyz.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by XYZ on 2017-08-13.
 */

public class SubActivity01 extends AppCompatActivity {
    public static final String TAG = "SubActivity01";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub01);

        Context context = getApplicationContext();
        CharSequence text = "SubActivity01이 실행되었습니다";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Log.d(TAG, "onCreate: SubActivity01이 실행되었습니다.");
    }
}
