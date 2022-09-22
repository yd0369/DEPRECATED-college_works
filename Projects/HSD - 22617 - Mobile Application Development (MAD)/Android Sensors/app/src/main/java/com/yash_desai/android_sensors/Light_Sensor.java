package com.yash_desai.android_sensors;

import androidx.appcompat.app.AppCompatActivity;

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

public class Light_Sensor extends AppCompatActivity implements SensorEventListener {
    SensorManager SensorMan;
    Sensor Light_Sensor;
    boolean Flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.light_sensor);

        SensorMan = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Light_Sensor = SensorMan.getDefaultSensor(Sensor.TYPE_LIGHT);
        SensorMan.registerListener(this , Light_Sensor,SensorManager.SENSOR_DELAY_FASTEST);
        ((FrameLayout) findViewById(R.id.BG_Light_Sensor)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Flag) {
                    Flag = false;
                }
                else {
                    Flag = true;
                    ((TextView) findViewById(R.id.INFO_Light_Sensor)).setText(((TextView) findViewById(R.id.INFO_Light_Sensor)).getText() + "\n\n[PAUSED]");
                }
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(!Flag) {
            int COLOR = (int) (event.values[0] / 16.0588235294);
            ((FrameLayout) findViewById(R.id.BG_Light_Sensor)).setBackgroundColor(Color.rgb(COLOR, COLOR, COLOR));
            ((TextView) findViewById(R.id.INFO_Light_Sensor)).setTextColor(Color.rgb(255 - COLOR, 255 - COLOR, 255 - COLOR));
            ((TextView) findViewById(R.id.INFO_Light_Sensor)).setText(Float.toString(event.values[0]) + " Lux\n\n#" + Integer.toHexString(Color.rgb(255 - COLOR, 255 - COLOR, 255 - COLOR)).toUpperCase());
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}
