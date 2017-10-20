package com.example.amikom.amikom_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleList extends AppCompatActivity {

    String[] osArray = {
            "Ubuntu",
            "Iphone",
            "Android",
            "Evercross",
            "Xiaomi Redmi"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, osArray
        );
        ListView listView = (ListView)findViewById(R.id.list_view);

        listView.setAdapter(arrayAdapter);
    }
}
