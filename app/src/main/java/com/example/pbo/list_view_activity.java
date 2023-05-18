package com.example.pbo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class list_view_activity extends AppCompatActivity {

    ListView lvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_visible);
        lvResult = (ListView) findViewById(R.id.lvResult);
        String[][] dataNegara = new String[][] {{"Indonesia", "ASIA", "indonesia"},
                {"Malaysia", "ASIA", "malaysia"},{"Singapore", "ASIA", "singapore"},
                {"Italia", "EROPA", "italia"},{"Inggris", "EROPA", "inggris"}
                ,{"Belanda", "EROPA", "belanda"},{"Argentina", "AMERIKA", "argentina"}
                ,{"Chile", "AMERIKA", "chile"},{"Mesir", "AFRIKA", "mesir"},
                {"Uganda", "AFRIKA", "uganda"}};
        negara_adapter adapter = new negara_adapter(list_view_activity.this, dataNegara);
        lvResult.setAdapter(adapter);
    }
}