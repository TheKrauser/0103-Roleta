package com.example.roleta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Gerar(View view) {
        Random rand = new Random();
        int generatedNumber;
        generatedNumber = rand.nextInt(101);
        TextView number = findViewById(R.id.number);
        number.setText(String.valueOf(generatedNumber));
    }
}