package com.yash_desai_and_sonu_tiwari.p8e1.demo_auto_complete_textview;

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
                android.R.layout.simple_list_item_1,
                new String[]{"Google","Bing","DuckDuckGo","Wiki.com","Twitter","CC Search",
                        "Gibiru","Internet Archive","Search Encrypt","Yandex","StartPage",
                        "Swisscows","Boardreader","SlideShare","Ecosia"}));

    }
}
