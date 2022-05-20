package com.ashik.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private int mCount=0;
private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView) findViewById(R.id.show_count);
    }

    public void show_toast(View view) {
        Toast toast=Toast.makeText(this,"Hello Toast",Toast.LENGTH_LONG);
                toast.show();

    }

    @SuppressLint("SetTextI18n")
    public void countup(View view) {
        final int i = mCount++;
        if(mShowCount!=null) mShowCount.setText(Integer.toString(mCount));
    }
}