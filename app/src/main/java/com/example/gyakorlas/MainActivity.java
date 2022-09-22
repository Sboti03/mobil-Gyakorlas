package com.example.gyakorlas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText szoveg;
    Button nagyBetuGomb;
    Button kisBetuGomb;
    Button randomSzinGomb;
    TextView eredmeny;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        nagyBetuGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eredmeny.setText(szoveg.getText().toString().toUpperCase());
            }
        });
        kisBetuGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eredmeny.setText(szoveg.getText().toString().toLowerCase());
            }
        });
        randomSzinGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                eredmeny.setBackgroundColor(Color.rgb(red, green, blue));
            }
        });
    }


    public void init() {
        szoveg = findViewById(R.id.szoveg);
        nagyBetuGomb = findViewById(R.id.nagybetusGomb);
        kisBetuGomb = findViewById(R.id.kisbetusGomb);
        randomSzinGomb = findViewById(R.id.veletlenszinGomb);
        eredmeny = findViewById(R.id.eredmeny);
    }


}