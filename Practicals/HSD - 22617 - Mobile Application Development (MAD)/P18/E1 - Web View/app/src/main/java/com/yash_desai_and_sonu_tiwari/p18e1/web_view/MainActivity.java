package com.yash_desai_and_sonu_tiwari.p18e1.web_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.navigate_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((WebView) findViewById(R.id.web_view)).getSettings().setLoadsImagesAutomatically(true);
                ((WebView) findViewById(R.id.web_view)).getSettings().setJavaScriptEnabled(true);
                ((WebView) findViewById(R.id.web_view)).loadUrl(((TextView) findViewById(R.id.url)).getText().toString());
            }
        });
    }
}
