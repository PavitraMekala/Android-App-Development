package com.example.indiantouristry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GridActivity7 extends AppCompatActivity {

    TextView name;
    ImageView image;
    TextView matter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid7);

        name = findViewById(R.id.griddata);
        image = findViewById(R.id.imageView);
        matter=findViewById(R.id.textview);

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("name"));
        image.setImageResource(intent.getIntExtra("image",0));
        matter.setText(intent.getStringExtra("matter"));
    }
}