package com.yash_desai_and_sonu_tiwari.p9e2.simple_calculator;

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
        ((Button) findViewById(R.id.add)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.result)).setText(Integer.toString(Integer.parseInt(((TextView) findViewById(R.id.op1)).getText().toString()) +
                        Integer.parseInt(((TextView) findViewById(R.id.op2)).getText().toString())));
            }
        });
        ((Button) findViewById(R.id.sub)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.result)).setText(Integer.toString(Integer.parseInt(((TextView) findViewById(R.id.op1)).getText().toString()) -
                        Integer.parseInt(((TextView) findViewById(R.id.op2)).getText().toString())));
            }
        });
        ((Button) findViewById(R.id.mul)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.result)).setText(Integer.toString(Integer.parseInt(((TextView) findViewById(R.id.op1)).getText().toString()) *
                        Integer.parseInt(((TextView) findViewById(R.id.op2)).getText().toString())));
            }
        });
        ((Button) findViewById(R.id.div)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.result)).setText(Integer.toString(Integer.parseInt(((TextView) findViewById(R.id.op1)).getText().toString()) /
                        Integer.parseInt(((TextView) findViewById(R.id.op2)).getText().toString())));
            }
        });
        ((Button) findViewById(R.id.mod)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.result)).setText(Integer.toString(Integer.parseInt(((TextView) findViewById(R.id.op1)).getText().toString()) %
                        Integer.parseInt(((TextView) findViewById(R.id.op2)).getText().toString())));
            }
        });
    }
}
