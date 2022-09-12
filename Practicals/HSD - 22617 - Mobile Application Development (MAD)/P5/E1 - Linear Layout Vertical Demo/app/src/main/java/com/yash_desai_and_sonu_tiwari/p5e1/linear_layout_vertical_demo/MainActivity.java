package com.yash_desai_and_sonu_tiwari.p5e1.linear_layout_vertical_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.disp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.result)).setText(
                        "Name : " +((TextView) findViewById(R.id.name)).getText().toString() + "\n" +
                                "Age : " +((TextView) findViewById(R.id.age)).getText().toString() + "\n" +
                                "Moblie Number : " +((TextView) findViewById(R.id.mobile_number)).getText().toString() + "\n"
                );
            }
        });
    }
}