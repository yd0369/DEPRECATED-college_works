package com.yash_desai_and_sonu_tiwari.p16e1.time_pickers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TimePicker) findViewById(R.id.time_picker)).setIs24HourView(false);
        ((TextView) findViewById(R.id.hrs_mode_disp)).setText("AM/PM");
        ((Switch) findViewById(R.id.hrs_mode)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                ((TimePicker) findViewById(R.id.time_picker)).setIs24HourView(isChecked);
                ((TextView) findViewById(R.id.hrs_mode_disp)).setText((isChecked) ?"24 Hours":"AM/PM");
            }
        });
        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.time_disp)).setText(
                        Integer.toString((((Switch) findViewById(R.id.hrs_mode)).isChecked()) ?
                                (((TimePicker) findViewById(R.id.time_picker)).getCurrentHour())
                                : (((((TimePicker) findViewById(R.id.time_picker)).getCurrentHour()) >= 12 )  ?
                                ((((TimePicker) findViewById(R.id.time_picker)).getCurrentHour())-12)
                                    : (((TimePicker) findViewById(R.id.time_picker)).getCurrentHour()))) +
                        " : " + Integer.toString(((TimePicker) findViewById(R.id.time_picker)).getCurrentMinute()) + " " +
                        ((((Switch) findViewById(R.id.hrs_mode)).isChecked()) ? ("")
                                : (((((TimePicker) findViewById(R.id.time_picker)).getCurrentHour()) >= 12 )  ?
                                ("PM") : ("AM")))
                );
            }
        });
    }
}