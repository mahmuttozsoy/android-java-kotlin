package com.example.a_01_first_project;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void change_image(View view){
        ImageView kaan_image = findViewById(R.id.myImageView);
        kaan_image.setImageResource(R.drawable.anka);

    }
}