package com.yash_desai.p30e1.sending_emails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.send)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MAILENT = new Intent(Intent.ACTION_SEND);
                MAILENT.setData(Uri.parse("mailto:"));
                MAILENT.setType("text/plain");
                MAILENT.putExtra(Intent.EXTRA_EMAIL, ((EditText) findViewById(R.id.receiver_address)).getText().toString());
                MAILENT.putExtra(Intent.EXTRA_SUBJECT, ((EditText) findViewById(R.id.msg_subject)).getText().toString());
                MAILENT.putExtra(Intent.EXTRA_TEXT, ((EditText) findViewById(R.id.msg_body)).getText().toString());
                startActivity(Intent.createChooser(MAILENT, "Sending Email..."));
                finish();
            }
        });
    }
}

