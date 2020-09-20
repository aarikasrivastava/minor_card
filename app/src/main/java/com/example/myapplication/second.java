package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class second extends AppCompatActivity {

    TextView mTextview, toall, heading, message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        mTextview = (TextView)findViewById(R.id.from1);
        mTextview.setText("From " + getIntent().getStringExtra("mytext"));

        toall = (TextView)findViewById(R.id.to_all);
        toall.setText("To "+ getIntent().getStringExtra( "mytext1"));

        heading = (TextView)findViewById(R.id.welcome);
        heading.setText(getIntent().getStringExtra("mytext2"));

        message = (TextView)findViewById(R.id.msg);
        message.setText(getIntent().getStringExtra("mytext3"));
    }
    }

