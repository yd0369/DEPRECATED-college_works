package com.yash_desai_and_sonu_tiwari.p4e2.student_name_and_marks;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.calculate_btn)).setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                ((EditText) findViewById(R.id.result)).setText(
                        (((EditText) findViewById(R.id.name)).getText().toString())+ " has scored "+Double.toString(((
                           Integer.parseInt(((EditText) findViewById(R.id.mgt)).getText().toString()) +
                           Integer.parseInt(((EditText) findViewById(R.id.pwp)).getText().toString()) +
                           Integer.parseInt(((EditText) findViewById(R.id.mad)).getText().toString()) +
                           Integer.parseInt(((EditText) findViewById(R.id.eti)).getText().toString()) +
                           Integer.parseInt(((EditText) findViewById(R.id.wbp)).getText().toString()) +
                           Integer.parseInt(((EditText) findViewById(R.id.ede)).getText().toString()) +
                           Integer.parseInt(((EditText) findViewById(R.id.cpe)).getText().toString())
                        )/8.5)) +"%");
            }
        });
    }
}
