package com.yash_desai_and_sonu_tiwari.p14e1.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((ListView) findViewById(R.id.LIST_VIEW)).setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,new String[]{"Android","Java","PHP","Hadoop","SAP","Python","Ajax","C++","Ruby","Rails","Perl","C","JavaScript","TypeScript"}));
        ((ListView) findViewById(R.id.LIST_VIEW)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),((ListView) findViewById(R.id.LIST_VIEW)).getAdapter().getItem(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}