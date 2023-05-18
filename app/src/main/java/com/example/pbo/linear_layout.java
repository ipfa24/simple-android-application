package com.example.pbo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class linear_layout extends AppCompatActivity {

    EditText nama, alamat;
    TextView hasil;
    Button tampilkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        tampilkan = (Button) findViewById(R.id.btntampilkan);
        nama = (EditText) findViewById(R.id.editnama);
        alamat = (EditText) findViewById(R.id.editalamat);
        hasil = (TextView) findViewById(R.id.txthasil);

        tampilkan.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                hasil.setText("Hello Nama Saya " + nama.getText().toString() + " dan Alamat Saya di " + alamat.getText().toString());
            }
        });
    }
}