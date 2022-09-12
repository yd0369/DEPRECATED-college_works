package com.yash_desai_and_sonu_tiwari.p13e2.horizontal_progress_bar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressDialog PD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PD = new ProgressDialog(MainActivity.this);
                PD.setMax(100);
                PD.setTitle("File Downloading...");
                PD.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                PD.show();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(PD.getProgress() <= PD.getMax()) {
                            try {
                                Thread.sleep(500);
                                H.sendMessage(H.obtainMessage());
                                if(PD.getProgress() == PD.getMax()) PD.dismiss();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
            Handler H = new Handler() {
                @Override
                public void handleMessage(@NonNull Message msg) {
                    super.handleMessage(msg);
                    PD.incrementProgressBy(1);
                }
            };
        });
    }
}


















//    void YASH_DESAI() {
//        final Timer t = new Timer();
//        PB = ((ProgressBar) findViewById(R.id.pb));
//        TimerTask tt = new TimerTask() {
//            @Override
//            public void run() {
//                i++;
//                PB.setProgress(i);
//                ((TextView) findViewById(R.id.percent)).setText(i+"%");
//                ((TextView) findViewById(R.id.stock)).setText(i+"/100");
//
//            }
//        };
//        t.schedule(tt,0,100);
//    }




//
//class YASH_DESAI extends Thread {
//    int i =0;
//    public void run() {
//        for(i=1; i<101;i++) {
//            ((ProgressBar) findViewById(R.id.pb)).setProgress(i);
//            ((TextView) findViewById(R.id.percent)).setText(i+"%");
//            ((TextView) findViewById(R.id.stock)).setText(i+"/100");
//            Log.d(Tag,"Yash Desai : "+i+"  ###################");
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}