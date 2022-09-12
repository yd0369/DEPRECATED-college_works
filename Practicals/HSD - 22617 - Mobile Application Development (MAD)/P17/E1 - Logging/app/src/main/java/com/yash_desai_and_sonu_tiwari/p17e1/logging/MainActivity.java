package com.yash_desai_and_sonu_tiwari.p17e1.logging;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Logger("<< State - onCreate() >>","No Error", "Currently Informing @ onCreate()","Currently Verbose of onCreate()","Currently Warning @ onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Logger("<< State - onStart() >>","No Error", "Currently Informing @ onStart()","Currently Verbose of onStart()","Currently Warning @ onStart()");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Logger("<< State - onResume() >>","No Error", "Currently Informing @ onResume()","Currently Verbose of onResume()","Currently Warning @ onResume()");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Logger("<< State - onPause() >>", "No Error", "Currently Informing @ onPause()", "Currently Verbose of onPause()", "Currently Warning @ onPause()");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Logger("<< State - onStop() >>", "No Error", "Currently Informing @ onStop()", "Currently Verbose of onStop()", "Currently Warning @ onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Logger("<< State - onDestroy() >>", "No Error", "Currently Informing @ onDestroy()", "Currently Verbose of onDestroy()", "Currently Warning @ onDestroy()");
        super.onDestroy();
    }

    void Logger(String DEBUG, String ERROR, String INFO, String VERBOSE, String WARN) {
        if(!DEBUG.isEmpty()) Log.d("Yash & Sonu : [Debug]",DEBUG);
        if(!ERROR.isEmpty()) Log.e("Yash & Sonu : [Error]",ERROR);
        if(!INFO.isEmpty()) Log.i("Yash & Sonu : [Info]",INFO);
        if(!VERBOSE.isEmpty()) Log.v("Yash & Sonu : [Verbose]",VERBOSE);
        if(!WARN.isEmpty()) Log.w("Yash & Sonu : [Warn]",WARN);
    }
}
