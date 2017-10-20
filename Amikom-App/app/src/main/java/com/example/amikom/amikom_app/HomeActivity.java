package com.example.amikom.amikom_app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by amikom on 13/10/2017.
 */

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSimpleList,btnCustomList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView usrText = (TextView) findViewById(R.id.textWelcome);
        SharedPreferences sf = getApplicationContext().getSharedPreferences("AmikomPref", Context.MODE_PRIVATE);
        String user = sf.getString("usr",null);

        btnSimpleList = (Button)findViewById(R.id.btnList);
        btnCustomList = (Button)findViewById(R.id.btnCustom);

        usrText.setText("Welcome "+user);

        btnSimpleList.setOnClickListener(this);
        btnCustomList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnList:
                Intent intent = new Intent(this, SimpleList.class);
                startActivity(intent);
                break;
        }
    }

}
