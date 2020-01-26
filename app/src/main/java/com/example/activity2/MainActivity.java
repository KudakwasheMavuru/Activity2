package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    TextView tv2;
    Button btn;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initilize button and textview here

        tv = (TextView) findViewById(R.id.textView);
        tv2 = (TextView)findViewById(R.id.textView2);
        btn = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                tv2.setText("How your tech skills will impact the society");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                btn.setTextSize(20);
                tv.setText("I am  RED!!");
                tv.setTextSize(18);

                tv.setBackgroundColor(Color.parseColor("#ff0000"));

            }
        });






    }
}
