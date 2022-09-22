package com.yash_desai.android_sensors;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        overridePendingTransition(R.anim.fade_in_motion_animation,R.anim.fade_out_motion_animation);
        setContentView(R.layout.activity_main);
        ((ImageView) findViewById(R.id.Image_View)).setImageResource(R.drawable.sensorlogo);
        ((ListView) findViewById(R.id.List_View)).setAdapter(new ArrayAdapter<String>(this,
                R.layout.my_list,new String[]{"Proximity Sensor","Accelerometer","Magnetometer","Gyroscope","Light Sensor"}));
        ((ListView) findViewById(R.id.List_View)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (((ListView) findViewById(R.id.List_View)).getAdapter().getItem(position).toString()) {
                    case "Proximity Sensor": {
                        startActivity(new Intent(MainActivity.this,Proximity_Sensor.class),ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                        overridePendingTransition(R.anim.fade_in_motion_animation,R.anim.fade_out_motion_animation);
                        break;
                    }
                    case "Accelerometer" : {
                        startActivity(new Intent(MainActivity.this,Accelerometer.class),ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                        overridePendingTransition(R.anim.fade_in_motion_animation,R.anim.fade_out_motion_animation);
                        break;
                    }
                    case "Magnetometer" : {
                        startActivity(new Intent(MainActivity.this,Magnetometer.class),ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                        overridePendingTransition(R.anim.fade_in_motion_animation,R.anim.fade_out_motion_animation);
                        break;
                    }
                    case "Gyroscope" : {
                        startActivity(new Intent(MainActivity.this,Gyroscope.class),ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                        overridePendingTransition(R.anim.fade_in_motion_animation,R.anim.fade_out_motion_animation);
                        break;
                    }
                    case "Light Sensor" : {
                        startActivity(new Intent(MainActivity.this,Light_Sensor.class),ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                        overridePendingTransition(R.anim.fade_in_motion_animation,R.anim.fade_out_motion_animation);
                        break;
                    }
                }
            }
        });
        ((ListView) findViewById(R.id.List_View)).setBackgroundColor(0x03FFFFFF);
    }
}