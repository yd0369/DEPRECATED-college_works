package com.yash_desai_and_sonu_tiwari.p27e1.login_form_validation_with_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.disp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!((TextView) findViewById(R.id.username)).getText().toString().isEmpty()) {
                    if(((TextView) findViewById(R.id.password)).getText().toString().equals("yash&sonu")) {
                        Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(MainActivity.this,"Login Unsuccessful",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}