package com.yash_desai.android_sensors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.Random;

public class Gyroscope extends AppCompatActivity implements SensorEventListener {
    SensorManager SensorMan;
    Sensor Gyroscope;
    String Direction;
    private int X=0,Y=0,Z=0,COLOR=0x00000000;
    boolean Flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.gyroscope);
        ((TextView) findViewById(R.id.INFO_Gyroscope)).setTextColor(0xFFFFFFFF);
        SensorMan = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Gyroscope = SensorMan.getDefaultSensor(Sensor.TYPE_GYROSCOPE);
        SensorMan.registerListener(this ,Gyroscope,SensorManager.SENSOR_DELAY_FASTEST);
        ((FrameLayout) findViewById(R.id.BG_Gyroscope)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Flag) {
                    Flag = false;
                }
                else {
                    Flag = true;
                    ((TextView) findViewById(R.id.INFO_Gyroscope)).setText(((TextView) findViewById(R.id.INFO_Gyroscope)).getText() + "\n\n[PAUSED]");
                }
            }
        });

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(!Flag) {
            double MAGNITITUDE = Math.sqrt(event.values[0] * event.values[0] + event.values[1] * event.values[1] + event.values[2] * event.values[2]);
            COLOR = 0xFF000000;
            if (event.values[0] > 0.5) {
                COLOR = COLOR + 0x00FF0000;
            } else if (event.values[0] < -0.5) {
                COLOR = COLOR + 0x00750000;
            }
            if (event.values[1] > 0.5) {
                COLOR = COLOR + 0x0000FF00;
            } else if (event.values[1] < -0.5) {
                COLOR = COLOR + 0x00007500;
            }
            if (event.values[2] > 0.5) {
                COLOR = COLOR + 0x000000FF;
            } else if (event.values[2] < -0.5) {
                COLOR = COLOR + 0x00000075;
            }
            ((FrameLayout) findViewById(R.id.BG_Gyroscope)).setBackgroundColor(COLOR);
            ((TextView) findViewById(R.id.INFO_Gyroscope)).setText(
                    "[ X : " + event.values[0] +
                            " ]\n[ Y : " + event.values[1] +
                            " ]\n[ Z : " + event.values[2] +
                            " ]\n\n:: Magnitude ::\n" + Double.toString(MAGNITITUDE) + " Omega\n\n#" + Integer.toHexString(COLOR).toUpperCase());
            ((FrameLayout) findViewById(R.id.BG_Gyroscope)).setBackgroundColor(COLOR);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}