package com.yash_desai_and_sonu_tiwari.p15e1.toast_message_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.toaster)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast T = Toast.makeText(getApplicationContext(),"Message for you:\nYou have got mail!",Toast.LENGTH_SHORT);
                T.setGravity(0,0,0);
                T.show();
            }
        });
    }
}