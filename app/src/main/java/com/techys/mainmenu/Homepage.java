package com.techys.mainmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.techys.R;


public class Homepage extends AppCompatActivity {

    private Button btnCircle1;
    private Button btnCircle2;
    private Button btnCircle3;
    private Button btnCircle4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        btnCircle1 = (Button) findViewById(R.id.btnCircle1);
        btnCircle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openScreen1();
            }
        });

        btnCircle2 = (Button) findViewById(R.id.btnCircle2);
        btnCircle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openScreen2();
            }
        });
        btnCircle3 = (Button) findViewById(R.id.btnCircle3);
        btnCircle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openScreen3();
            }
        });
        btnCircle4 = (Button) findViewById(R.id.btnCircle4);
        btnCircle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Homepage.this, "Circle Button Clicked.", Toast.LENGTH_SHORT).show();
                openScreen4();
            }
        });

    }
    public void openScreen1(){
        Intent intent= new Intent(this, Screen1.class);
        startActivity(intent);
    }
    public void openScreen2(){
        Intent intent= new Intent(this, Screen2.class);
        startActivity(intent);
    }
    public void openScreen3(){
        Intent intent= new Intent(this, Screen3.class);
        startActivity(intent);
    }
    public void openScreen4(){
        Intent intent= new Intent(this, Screen4.class);
        startActivity(intent);
    }


}