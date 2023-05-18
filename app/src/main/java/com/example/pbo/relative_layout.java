package com.example.pbo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class relative_layout extends AppCompatActivity {

    Spinner data;
    Button oke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        data = (Spinner) findViewById(R.id.provinsi);
        oke = (Button) findViewById(R.id.tombol);

        oke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(relative_layout.this, "Pilihan " + data.getSelectedItem().toString()
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }
}