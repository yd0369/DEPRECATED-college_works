package com.yash_desai_and_sonu_tiwari.p21e1.system_broadcast_messages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.registerReceiver(new Broadcast_Receiver(), new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED));
    }
    static void TOAST_IT(Context context, Intent intent) {
        Toast T = Toast.makeText(context, "Yash & Sonu's App : " + intent.getAction(), Toast.LENGTH_LONG);
        T.setGravity(0,0,0);
        T.show();
    }
}