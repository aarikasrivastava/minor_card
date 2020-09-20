package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              open();
            }
        });
    }



    public void open() {

        Intent intent = new Intent(this, second.class);
        EditText editText = (EditText)findViewById(R.id.from);
        String text = editText.getText().toString();
        EditText editText1 = (EditText)findViewById(R.id.to);
        String text1 = editText1.getText().toString();
        EditText editText2 = (EditText)findViewById(R.id.heading);
        String text2 = editText2.getText().toString();
        EditText editText3 = (EditText)findViewById(R.id.message);
        String text3 = editText3.getText().toString();
        intent.putExtra("mytext", text);
        intent.putExtra("mytext1",text1);
        intent.putExtra("mytext2",text2);
        intent.putExtra("mytext3",text3);

        startActivity(intent);
}}



