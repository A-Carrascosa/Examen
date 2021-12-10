package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrenament1(View view) {
        text = findViewById(R.id.description);
        text.setText(Entrenament.entrenaments[0].getDescripcio());
    }

    public void entrenament2(View view) {
        text = findViewById(R.id.description);
        text.setText(Entrenament.entrenaments[1].getDescripcio());
    }

    public void entrenament3(View view) {
        text = findViewById(R.id.description);
        text.setText(Entrenament.entrenaments[2].getDescripcio());
    }

    public void entrenament4(View view) {
        text = findViewById(R.id.description);
        text.setText(Entrenament.entrenaments[3].getDescripcio());
    }
}