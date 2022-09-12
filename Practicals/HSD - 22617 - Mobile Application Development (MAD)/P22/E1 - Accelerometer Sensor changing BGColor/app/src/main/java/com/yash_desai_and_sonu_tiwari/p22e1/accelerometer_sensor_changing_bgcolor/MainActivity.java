package com.yash_desai_and_sonu_tiwari.p22e1.accelerometer_sensor_changing_bgcolor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
        static SensorManager SenseMan;
        static Sensor Accelerometer;
        private int X=0,Y=0,Z=0,COLOR=0xFFFFFFFF;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            SenseMan = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
            Accelerometer = SenseMan.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
            SenseMan.registerListener(MainActivity.this,Accelerometer,SenseMan.SENSOR_DELAY_NORMAL);
        }
        @Override
        public void onSensorChanged(SensorEvent event) {
            if (((int)event.values[0] != X) && ((int)event.values[1] != Y) && ((int)event.values[2] != Z)) {
                COLOR = 0xFF000000  +new Random().nextInt(16777215);
                ((ConstraintLayout) findViewById(R.id.MAIN)).setBackgroundColor(COLOR);
            }
            ((TextView) findViewById(R.id.INFO)).setText("[ X : " + event.values[0] + " ]\n[ Y : " + event.values[1] + " ]\n[ Z : " + event.values[2] + "]\n\n"+Integer.toHexString(COLOR).toUpperCase());
            X = (int) event.values[0];
            Y = (int) event.values[1];
            Z = (int) event.values[2];
            Log.d("YASH1234", "[ " + event.values[0] + event.values[1] + event.values[2] + " ]    -- ");
        }
        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    }