package com.yash_desai.p29e1.send_and_receive_sms;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    static String STR_Array[] = new String[20];
    static int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.send)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SMSTENT = new Intent(Intent.ACTION_VIEW);
                SMSTENT.setData(Uri.parse("smsto:"));
                SMSTENT.setType("vnd.android-dir/mms-sms");
                SMSTENT.putExtra("address"  , ((EditText) findViewById(R.id.receiver)).getText().toString());
                SMSTENT.putExtra("sms_body"  , ((EditText) findViewById(R.id.msg)).getText().toString());
                startActivity(SMSTENT);
                finish();
            }
        });
    }
}