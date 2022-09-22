package com.yash_desai.android_sensors;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Splash_Screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_screen);
        ((ImageView) findViewById(R.id.Image_View_main)).setImageResource(R.drawable.sensorlogo);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ActivityOptions options = ActivityOptions
                        .makeSceneTransitionAnimation(Splash_Screen.this, findViewById(R.id.Image_View_main), "reflex");
                startActivity(new Intent(Splash_Screen.this, MainActivity.class),options.toBundle());
                //overridePendingTransition(R.anim.fade_out_motion_animation,R.anim.fade_out_motion_animation);
                        finish();
            }
        }, 5000);
    }
}
