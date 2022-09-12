package com.yash_desai_and_sonu_tiwari.p14e3.grid_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((GridView) findViewById(R.id.GRID)).setAdapter(new ArrayAdapter<Integer>(this,
                android.R.layout.simple_list_item_1,
                new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));
        ((GridView) findViewById(R.id.GRID)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),(((GridView) findViewById(R.id.GRID)).getItemAtPosition(position).toString()),Toast.LENGTH_SHORT).show();
            }
        });
    }
}