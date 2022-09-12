package com.yash_desai.p25e1.image_view_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int DURATION = 500;
    Animation ANIMATION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ANIMATION_SET(R.anim.filler);
        ((TextView) findViewById(R.id.duration)).setText("Duration : "+DURATION);
        ((ImageView) findViewById(R.id.image)).setImageResource(R.drawable.pop);
        ((Button) findViewById(R.id.duration_plus)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DURATION += 25;
                ((TextView) findViewById(R.id.duration)).setText("Duration : "+DURATION);
                ANIMATION.setDuration(DURATION);
                ((ImageView) findViewById(R.id.image)).setAnimation(ANIMATION);
            }
        });

        ((Button) findViewById(R.id.duration_minus)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DURATION -= 25;
                ((TextView) findViewById(R.id.duration)).setText("Duration : "+DURATION);
                ANIMATION.setDuration(DURATION);
                ((ImageView) findViewById(R.id.image)).setAnimation(ANIMATION);
            }
        });

        ((Button) findViewById(R.id.rotate_clockwise)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ANIMATION_SET(R.anim.rotate_clockwise);
            }
        });

        ((Button) findViewById(R.id.rotate_anticlockwise)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ANIMATION_SET(R.anim.rotate_anticlockwise);
            }
        });

        ((Button) findViewById(R.id.fade_in)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ANIMATION_SET(R.anim.fade_in);
            }
        });


        ((Button) findViewById(R.id.fade_out)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ANIMATION_SET(R.anim.fade_out);
            }
        });

        ((Button) findViewById(R.id.zoom_in)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ANIMATION_SET(R.anim.zoom_in);
            }
        });

        ((Button) findViewById(R.id.zoom_out)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ANIMATION_SET(R.anim.zoom_out);
            }
        });
    }
    void ANIMATION_SET(int ANIPLEX) {
        ANIMATION = AnimationUtils.loadAnimation(getApplicationContext(),ANIPLEX);
        ANIMATION.setDuration(DURATION);
        ((ImageView) findViewById(R.id.image)).setAnimation(ANIMATION);
    }
}
