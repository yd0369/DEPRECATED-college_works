package com.yash_desai_and_sonu_tiwari.p7e2.student_info;

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
                        "Gender : " +((TextView) findViewById(R.id.gender)).getText().toString() + "\n" +
                        "Mob.# [P] : " +((TextView) findViewById(R.id.p_mobnumber)).getText().toString() + "\n" +
                        "Mob.# [S] : " +((TextView) findViewById(R.id.s_mobnumber)).getText().toString() + "\n" +
                        "Major : " +((TextView) findViewById(R.id.major)).getText().toString() + "\n" +
                        "Minor : " +((TextView) findViewById(R.id.minor)).getText().toString() + "\n" +
                        "Address : " +((TextView) findViewById(R.id.address)).getText().toString()
                );
            }
        });
    }
}







