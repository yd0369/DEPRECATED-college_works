package com.yash_desai_and_sonu_tiwari.p20e2.starting_and_stopping_service;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

public class __Yash_and_Sonu_Service__ extends Service {
    private static final String TAG = "MyService";
    private boolean isRunning  = false;
    private Looper looper;
    private Servant myServiceHandler;
    @Override
    public void onCreate() {
        HandlerThread handlerthread = new HandlerThread("MyThread");
        handlerthread.start();
        looper = handlerthread.getLooper();
        myServiceHandler = new Servant(looper);
        isRunning = true;
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Message msg = myServiceHandler.obtainMessage();
        msg.arg1 = startId;
        myServiceHandler.sendMessage(msg);
        Toast.makeText(this, "Service Started.", Toast.LENGTH_SHORT).show();
        //If service is killed while starting, it restarts.
        return START_STICKY;
    }
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onDestroy() {
        isRunning = false;
        Toast.makeText(this, "Service Completed or Stopped.", Toast.LENGTH_SHORT).show();
    }
    private final class Servant extends Handler {
        public Servant(Looper looper) {
            super(looper);
        }
        @Override
        public void handleMessage(Message msg) {
            synchronized (this) {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        Log.e(TAG, e.getMessage());
                    }
                    if(!isRunning){
                        break;
                    }
                }
            }
            stopSelfResult(msg.arg1);
        }
    }
}