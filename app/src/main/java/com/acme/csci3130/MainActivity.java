package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    int Validate(String password){
        int testsPassed = 0;
        if(!(password.toLowerCase().equals("password"))){
            testsPassed++;
        }
        if(password.length()>7){
            testsPassed++;
        }
        return testsPassed;
    }
}
