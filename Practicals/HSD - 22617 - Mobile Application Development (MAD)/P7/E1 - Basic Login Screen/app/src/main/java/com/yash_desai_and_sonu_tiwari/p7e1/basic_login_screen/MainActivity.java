package com.yash_desai_and_sonu_tiwari.p7e1.basic_login_screen;

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
                        "Username : " +((TextView) findViewById(R.id.username)).getText().toString() + "\n" +
                                "Password : " +((TextView) findViewById(R.id.password)).getText().toString()
                );
            }
        });

    }
}




