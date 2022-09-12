package com.yash_desai_and_sonu_tiwari.p10e1.social_network_login_form;

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
                if(((TextView) findViewById(R.id.password)).getText().toString().equals("yash&sonu")) {
                    ((TextView) findViewById(R.id.result)).setText("Login Successfully... \n\n>>> With >>>\n"+
                            "Username : " + ((TextView) findViewById(R.id.username)).getText().toString() + "\n" +
                            "Password : " + ((TextView) findViewById(R.id.password)).getText().toString());
                }
                else {
                    ((TextView) findViewById(R.id.result)).setText("Login Failed...\n[ Password Wrong... ]");
                }
            }
        });
    }
}