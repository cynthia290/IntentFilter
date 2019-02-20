package com.example.intentfilter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String t = getIntent().getStringExtra("Mensaje");

        txt = findViewById(R.id.txt);

        if (t != null){
            txt.setText(t);
        }


    }
}
