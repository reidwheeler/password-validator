package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int Validate(String password){
        int testsPassed = 0;

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
        return testsPassed;
    }
}
