package com.example.amikom.amikom_app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText usr = (EditText)findViewById(R.id.usr);
        final EditText pwd = (EditText)findViewById(R.id.pwd);
        Button login = (Button)findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.util.Log.d("--Amikom--",usr.getText().toString());
                android.util.Log.d("--Amikom--",pwd.getText().toString());

                String user_name = usr.getText().toString();
                String pass_ =  pwd.getText().toString();

               if (user_name.equals("arif")&&pass_.equals("arif")){
                   Toast.makeText(getApplicationContext(),"is Logged in..",Toast.LENGTH_SHORT).show();

                   Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                   startActivity(intent);

                   // edit preference
                   SharedPreferences sf = getSharedPreferences("AmikomPref", Context.MODE_PRIVATE);
                   SharedPreferences.Editor editor = sf.edit();

                   editor.putString("usr",usr.getText().toString());
                   editor.commit();

                   finish();


               }
               else {
                   Toast.makeText(getApplicationContext(), "Incorrect password or username", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
