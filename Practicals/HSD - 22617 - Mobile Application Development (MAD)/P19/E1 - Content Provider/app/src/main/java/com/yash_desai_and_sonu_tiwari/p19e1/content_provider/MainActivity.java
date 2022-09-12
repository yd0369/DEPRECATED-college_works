package com.yash_desai_and_sonu_tiwari.p19e1.content_provider;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
        @Override
        public boolean onTouchEvent(MotionEvent event) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            return true;
        }
        public void onClickAddDetails(View view) {
            ContentValues values = new ContentValues();
            values.put(Content_Provider_ELZA.name, ((EditText) findViewById(R.id.txtName)).getText().toString());
            getContentResolver().insert(Content_Provider_ELZA   .CONTENT_URI, values);
            Toast.makeText(getBaseContext(), "New Record Inserted", Toast.LENGTH_LONG).show();
        }

        public void onClickShowDetails(View view) {
            // Retrieve employee records
            TextView resultView= (TextView) findViewById(R.id.res);
            Cursor cursor = getContentResolver().query(Uri.parse("content://com.yash_desai_and_sonu_tiwari.p19e1.content_provider.content_provider_elza/DATA"), null, null, null, null);
            if(cursor.moveToFirst()) {
                StringBuilder strBuild=new StringBuilder();
                while (!cursor.isAfterLast()) {
                    strBuild.append("\n"+cursor.getString(cursor.getColumnIndex("id"))+ "-"+ cursor.getString(cursor.getColumnIndex("name")));
                    cursor.moveToNext();
                }
                resultView.setText(strBuild);
            }
            else {
                resultView.setText("No Records Found");
            }
        }
    }