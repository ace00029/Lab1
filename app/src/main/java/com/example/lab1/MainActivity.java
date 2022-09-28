package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeText(View v)
    {
        TextView tv = (TextView)findViewById(R.id.mainText);
        tv.setText("Welcome to Android");
    }

    public void changeColor(View v)
    {
        TextView tv = (TextView)findViewById(R.id.mainText);
        tv.setTextColor(Color.RED);
    }
}