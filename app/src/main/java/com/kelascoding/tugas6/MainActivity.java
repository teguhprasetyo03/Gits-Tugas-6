package com.kelascoding.tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView ImgV;
    TextView tvnama, tvgits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     ImgV = findViewById(R.id.img_1);
     tvnama = findViewById(R.id.tv_name);
     tvgits = findViewById(R.id.tv_gits);
    }
}