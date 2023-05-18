package com.example.pbo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username, password;
    Button login;
    TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.txt_username);
        password = (EditText) findViewById(R.id.txt_password);
        login = (Button) findViewById(R.id.button);
        signup = (TextView) findViewById(R.id.signup_reg);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equalsIgnoreCase("user")
                        && password.getText().toString().equalsIgnoreCase("user123")){
                    Toast.makeText(login.this, "Anda Berhasil Login",
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(login.this, "Username atau Password Anda Salah",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(login.this, register.class);
                startActivity(register);
            }
        });

    }
}