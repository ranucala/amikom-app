package com.example.amikom.amikom_app;

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

                Toast.makeText(getApplicationContext(),usr.getText().toString()+"is Logged in..",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
