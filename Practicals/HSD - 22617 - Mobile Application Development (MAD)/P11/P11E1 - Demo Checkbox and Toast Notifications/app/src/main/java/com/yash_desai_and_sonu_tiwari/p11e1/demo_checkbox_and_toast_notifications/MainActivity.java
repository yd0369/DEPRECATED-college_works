package com.yash_desai_and_sonu_tiwari.p11e1.demo_checkbox_and_toast_notifications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((CheckBox) findViewById(R.id.c)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster();
            }
        });
        ((CheckBox) findViewById(R.id.cpp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster();
            }
        });
        ((CheckBox) findViewById(R.id.java)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster();
            }
        });
        ((CheckBox) findViewById(R.id.python)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster();
            }
        });
        ((CheckBox) findViewById(R.id.kotlin)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster();
            }
        });

    }
    void Toaster() {
        Toast.makeText(getApplicationContext(),(
                "Programming Languages you have selected : \n" +
                ((((CheckBox) findViewById(R.id.c)).isChecked() == true  )? "C\n": "") +
                        ((((CheckBox) findViewById(R.id.cpp)).isChecked() == true )? "C++\n": "") +
                        ((((CheckBox) findViewById(R.id.java)).isChecked() == true  )? "Java\n": "") +
                        ((((CheckBox) findViewById(R.id.python)).isChecked() == true  )? "Python\n": "") +
                        ((((CheckBox) findViewById(R.id.kotlin)).isChecked() == true  )? "Kotlin\n": "")
                ),Toast.LENGTH_SHORT).show();
    }
}