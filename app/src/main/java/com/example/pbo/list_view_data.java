package com.example.pbo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list_view_data extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_data);
        ListView listView;
        ArrayAdapter<String> arrayAdapter;
        String[] programmingLang = {
                "Java", "Android","C++","C#","Visual Basic","Ruby","Python","PHP","Lisp"
        };
        listView = (ListView) findViewById(R.id.listViewProgramming);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programmingLang);
        listView.setAdapter(arrayAdapter);
    }
}