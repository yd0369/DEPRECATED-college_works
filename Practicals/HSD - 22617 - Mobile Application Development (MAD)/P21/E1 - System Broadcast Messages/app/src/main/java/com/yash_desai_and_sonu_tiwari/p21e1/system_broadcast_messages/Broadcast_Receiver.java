package com.yash_desai_and_sonu_tiwari.p21e1.system_broadcast_messages;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Broadcast_Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        MainActivity.TOAST_IT(context,intent);
    }
}