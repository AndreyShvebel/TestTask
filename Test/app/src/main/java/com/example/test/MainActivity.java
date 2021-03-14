package com.example.test;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    Button bChangeColor, bResetColor;
    protected float r;
    protected float g;
    protected float b;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bChangeColor =findViewById(R.id.b1);
        bResetColor =findViewById(R.id.b2);
        layout=findViewById(R.id.ll);

        bChangeColor.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) { //generates and sets new colors to bg on button click
                r = (float) Math.random();
                g = (float) Math.random();
                b = (float) Math.random();
                layout.setBackgroundColor(Color.rgb(r,g,b));
            }
        });

        bResetColor.setOnClickListener(new View.OnClickListener(){ //resets bg color to default (white)
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.WHITE);
            }
        });
    }
}