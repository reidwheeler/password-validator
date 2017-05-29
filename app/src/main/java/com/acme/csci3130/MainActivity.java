package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                Validate(v);
            }
        });
    }

    void Validate(View view){
        int testsPassed = 0;
        TextView message = (TextView)findViewById(R.id.helloText);
        EditText phrase = (EditText) findViewById(R.id.editText);
        String password = phrase.getText().toString();

        if(!(password.toLowerCase().equals("password"))){
            testsPassed++;
        }
        if(password.length()>7){
            testsPassed++;
        }
        if(password.matches(".*\\d.*")){
            testsPassed++;
        }
        if(password.matches(".*[A-Z].*")){
            testsPassed++;
        }
        if(password.matches(".*[^A-Za-z0-9].*")){
            testsPassed++;
        }
        if(testsPassed<5){
            message.setText("Invalid Password!");
        }
        else{
            message.setText("Valid Password!");
        }
    }
}
