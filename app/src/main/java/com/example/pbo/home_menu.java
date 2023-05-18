package com.example.pbo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_menu extends AppCompatActivity {

    Button linear, relative, login, listview, prolang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);
        linear = (Button) findViewById(R.id.btnLinear);
        relative = (Button) findViewById(R.id.btnRelative);
        login = (Button) findViewById(R.id.btnLogin);
        listview = (Button) findViewById(R.id.btnlistView);
        prolang = (Button) findViewById(R.id.btnprolang);
        linear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent linearlayout = new Intent(home_menu.this, linear_layout.class);
                startActivity(linearlayout);
            }
        });
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relativelayout = new Intent(home_menu.this, relative_layout.class);
                startActivity(relativelayout);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menulogin = new Intent(home_menu.this, login.class);
                startActivity(menulogin);
            }
        });
        listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent negara = new Intent(home_menu.this, list_view_activity.class);
                startActivity(negara);
            }
        });
        prolang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prolang = new Intent(home_menu.this, list_view_data.class);
                startActivity(prolang);
            }
        });
    }
}