package com.yash_desai_and_sonu_tiwari.p28e1.login_form_extra_validation_with_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int failed_login_count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.disp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((TextView) findViewById(R.id.username)).getText().toString().isEmpty() || ((TextView) findViewById(R.id.password)).getText().toString().isEmpty()) {
                    Invalid_Entry("One or more field(s) are empty");

                }
                else {
                    if((((TextView) findViewById(R.id.username)).getText().length() <= 8)  || ((((TextView) findViewById(R.id.password)).getText().length() <= 8))) {
                        Invalid_Entry("Short User Name or Password");
                    }
                    else {
                        if(((TextView) findViewById(R.id.password)).getText().toString().equals("yash&sonu")) {
                            Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG).show();
                        }
                        else {
                            Invalid_Entry("Password Not Matched");
                        }
                    }
                }
            }
        });
    }
    void Invalid_Entry(String REASON) {
        failed_login_count++;
        Toast.makeText(MainActivity.this,"Login Unsuccessful\nReason : "+REASON+"\nLogin Attemt Failed : x"+failed_login_count,Toast.LENGTH_LONG).show();
    }
}