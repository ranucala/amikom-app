package com.example.amikom.amikom_app;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button)findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new LoginTask().execute();
            }
        });
    }

    private class LoginTask extends AsyncTask<Void,Integer,String> {

        private ProgressDialog dialog = new ProgressDialog(MainActivity.this);

        @Override
        protected String doInBackground(Void...voids){
            try {
                for (int i = 0;i <= 10;i++){
                    Thread.sleep(500);
                    Log.i("Thread","Execute"+i);
                }
                return "Successful";
            }
            catch (Exception e){
                Log.i("Exception",e.getMessage());
                return "Failure";
            }
        }
        protected void onPreExecute(){
            dialog.setMessage("Press Login");
            dialog.show();
        }

        protected void onPostExecute(String rs){
            dialog.dismiss();
            final EditText usr = (EditText)findViewById(R.id.usr);
            final EditText pwd = (EditText)findViewById(R.id.pwd);

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
    }


}
