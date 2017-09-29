package com.ranucala.amikomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg= "--Amikom App :";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(msg,"The onCreate() Event");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(msg,"The onStart() Event");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(msg,"The onResume() Event");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(msg,"The onPause() Event");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(msg,"The onStop() Event");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(msg,"The onRestart() Event");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(msg,"The onDestroy() Event");
    }
}
