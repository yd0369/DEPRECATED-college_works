package com.yash_desai_and_sonu_tiwari.p14e2.image_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean YASH = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((ImageView) findViewById(R.id.img_view)).setImageResource(R.drawable.yash_image);
        ((Button) findViewById(R.id.change_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(YASH) {
                    ((ImageView) findViewById(R.id.img_view)).setImageResource(R.drawable.yash_image);
                    YASH=false;
                }
                else {
                    ((ImageView) findViewById(R.id.img_view)).setImageResource(R.drawable.sonu_image);
                    YASH=true;
                }

            }
        });

    }
}
