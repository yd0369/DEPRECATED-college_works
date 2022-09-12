package com.yash_desai.p26e1.inserting_data_in_database_using_asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    static final int DB_VERSION = 1;
    static final String DB_NAME = "YASH_DESAI_DB.db";
    static final String DB_TABLE_NAME = "yash_desai_data";
    static String DATA = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.make_entry)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DATA = ((EditText) findViewById(R.id.data)).getText().toString();
                Asynchronous_Task Async_Task = new Asynchronous_Task(MainActivity.this);
                Async_Task.execute();
                finish();
            }
        });

    }
}