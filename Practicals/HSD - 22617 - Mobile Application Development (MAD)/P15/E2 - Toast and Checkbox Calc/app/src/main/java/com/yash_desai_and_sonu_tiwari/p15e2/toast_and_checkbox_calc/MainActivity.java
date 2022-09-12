package com.yash_desai_and_sonu_tiwari.p15e2.toast_and_checkbox_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.order)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster();
            }
        });

    }
    void Toaster() {
        Toast.makeText(getApplicationContext(),(
                "Selected Items : \n\n" +
                        ((((CheckBox) findViewById(R.id.pizza)).isChecked() == true  )?  "Pizza   : 300 INR\n": "") +
                        ((((CheckBox) findViewById(R.id.coffee)).isChecked() == true )?  "Coffee :  50 INR\n": "") +
                        ((((CheckBox) findViewById(R.id.burger)).isChecked() == true  )? "Burger : 120 INR\n": "") +
                        "\n Total : "+(
                                ((((CheckBox) findViewById(R.id.pizza)).isChecked() == true  )? 300 : 0) +
                                ((((CheckBox) findViewById(R.id.coffee)).isChecked() == true )? 50 : 0) +
                                ((((CheckBox) findViewById(R.id.burger)).isChecked() == true  )? 120 : 0) + " INR")),Toast.LENGTH_SHORT).show();
    }
}