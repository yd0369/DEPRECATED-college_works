package com.yash_desai.android_sensors;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Magnetometer extends AppCompatActivity implements SensorEventListener {
    private SensorManager SenseMan;
    Sensor Magnetometer;
    boolean Flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.magnetometer);

        SenseMan = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Magnetometer = SenseMan.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
        SenseMan.registerListener(this , Magnetometer,SensorManager.SENSOR_DELAY_FASTEST);

        ((FrameLayout) findViewById(R.id.BG_Magnetometer)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Flag) {
                    Flag = false;
                }
                else {
                    Flag = true;
                    ((TextView) findViewById(R.id.INFO_Magnetometer)).setText(((TextView) findViewById(R.id.INFO_Magnetometer)).getText() + "\n\n[PAUSED]");
                }
            }
        });

    }
    double MAGNITITUDE;
    int COLOR;
    int T_COLOR;
    @Override
    public void onSensorChanged(SensorEvent event) {
        if(!Flag) {
            MAGNITITUDE = Math.sqrt(
                    (event.values[0] * event.values[0]) +
                            (event.values[1] * event.values[1]) +
                            (event.values[2] * event.values[2]));
            COLOR = 0xFF000000;
            T_COLOR = 0xFF000000;
            if (event.values[0] > 2000) {
                COLOR = COLOR + 0x00FF0000;
            } else if (event.values[0] < 2000 && event.values[0] > 500) {
                COLOR = COLOR + 0x00750000;
            } else if (event.values[0] < 500 && event.values[0] > -500) {
                COLOR = COLOR + 0x00000000;
                T_COLOR += 0xFFFF0000;
            } else if (event.values[0] < -2000 && event.values[0] > -500) {
                COLOR = COLOR + 0x00750000;
            } else if (event.values[0] < -2000) {
                COLOR = COLOR + 0x00FF0000;
            }
            if (event.values[1] > 2000) {
                COLOR = COLOR + 0x0000FF00;
            } else if (event.values[1] < 2000 && event.values[1] > 500) {
                COLOR = COLOR + 0x00007500;
            } else if (event.values[1] < 500 && event.values[1] > -500) {
                COLOR = COLOR + 0x00000000;
                T_COLOR += 0xFF00FF00;
            } else if (event.values[1] < -2000 && event.values[1] > -500) {
                COLOR = COLOR + 0x00007500;
            } else if (event.values[1] < -2000) {
                COLOR = COLOR + 0x0000FF00;
            }
            if (event.values[2] > 2000) {
                COLOR = COLOR + 0x000000FF;
            } else if (event.values[2] < 2000 && event.values[2] > 500) {
                COLOR = COLOR + 0x00000075;
            } else if (event.values[2] < 500 && event.values[2] > -500) {
                COLOR = COLOR + 0x00000000;
                T_COLOR += 0xFF0000FF;
            } else if (event.values[2] < -2000 && event.values[2] > -500) {
                COLOR = COLOR + 0x00000075;
            } else if (event.values[2] < -2000) {
                COLOR = COLOR + 0x000000FF;
            }
            ((TextView) findViewById(R.id.INFO_Magnetometer)).setTextColor(T_COLOR);
            ((TextView) findViewById(R.id.INFO_Magnetometer)).setText(
                    "[ X : " + event.values[0] +
                            " ]\n[ Y : " + event.values[1] +
                            " ]\n[ Z : " + event.values[2] +
                            " ]\n\n:: Magnitude ::\n" + Double.toString(MAGNITITUDE) + " μTesla\n\n#" + Integer.toHexString(COLOR).toUpperCase());
            ((FrameLayout) findViewById(R.id.BG_Magnetometer)).setBackgroundColor(COLOR);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}