package com.yash_desai_and_sonu_tiwari.p8e2.sixth_semester_subjects_autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((AutoCompleteTextView) findViewById(R.id.kexts)).setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.select_dialog_item,
                new String[]{"Mobile Application Development","Web Based Application Development","Programming with Python","Entrepreneurship Development","Capstone Project Execution"}));
    }
}
