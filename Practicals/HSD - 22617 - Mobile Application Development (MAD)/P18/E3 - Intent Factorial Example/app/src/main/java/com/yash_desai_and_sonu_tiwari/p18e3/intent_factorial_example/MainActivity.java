package com.yash_desai_and_sonu_tiwari.p18e3.intent_factorial_example;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.fact)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(
                        new Intent(MainActivity.this,
                                ResultActivity.class).putExtra(
                                Intent.EXTRA_TEXT,
                        factorial()));
            }
        });
    }
    String factorial() {
        long FACT=1;
        for(int i=Integer.parseInt(((TextView) findViewById(R.id.fact_in)).getText().toString()); i>0;i--) {
            FACT *= i;
        }
        return "Factorial of "+ ((TextView) findViewById(R.id.fact_in)).getText().toString() + " is " + Long.toString(FACT);
    }
}
