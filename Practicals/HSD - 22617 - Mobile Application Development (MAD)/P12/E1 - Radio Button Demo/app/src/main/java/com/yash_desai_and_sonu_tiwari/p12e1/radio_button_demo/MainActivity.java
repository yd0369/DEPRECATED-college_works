package com.yash_desai_and_sonu_tiwari.p12e1.radio_button_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((RadioGroup) findViewById(R.id.gender)).check(R.id.male);
        ((Button) findViewById(R.id.disp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toaster();
            }
        });

    }
    void Toaster() {
        Toast.makeText(getApplicationContext(),(
                "You have selected : \n\nSingle Radio Buttons : \n" +
                        ((((RadioButton) findViewById(R.id.rb1)).isChecked() == true  )? "Radio Button 1\n": "") +
                        ((((RadioButton) findViewById(R.id.rb2)).isChecked() == true  )? "Radio Button 2\n": "") +
                        "\nRadio button inside RadioGroup : " +
                        ((((RadioGroup) findViewById(R.id.gender)).getCheckedRadioButtonId() == R.id.male) ? "Male" : "Female")
        ), Toast.LENGTH_SHORT).show();
    }
}



