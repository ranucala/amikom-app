package com.example.amikom.amikom_app;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by amikom on 13/10/2017.
 */

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView usrText = (TextView) findViewById(R.id.textWelcome);
        SharedPreferences sf = getApplicationContext().getSharedPreferences("AmikomPref", Context.MODE_PRIVATE);
        String user = sf.getString("usr",null);

        usrText.setText("Welcome "+user);
    }

}
