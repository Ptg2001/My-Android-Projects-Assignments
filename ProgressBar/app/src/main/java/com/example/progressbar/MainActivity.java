package com.example.progressbar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    Button startDownload;
    ProgressDialog progressBar;
    private int progressBarStatus = 0;
    private Handler progressBarHandler = new Handler();

    private long level = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startDownload = (Button) findViewById(R.id.startDownload);

        startDownload.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {


                progressBar = new ProgressDialog(v.getContext());
                progressBar.setCancelable(true);
                progressBar.setMessage("File Downloading ...");
                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressBar.setProgress(0);
                progressBar.setMax(100);
                progressBar.show();
                progressBarStatus = 0;
                level = 0;
                new Thread(new Runnable() {
                    public void run() {
                        while (progressBarStatus < 100) {

                            progressBarStatus = progresslevel();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            progressBarHandler.post(new Runnable() {
                                public void run() {
                                    progressBar.setProgress(progressBarStatus);

                                }
                            });
                        }

                        if (progressBarStatus >= 100) {


                            try {
                                Thread.sleep(2000);

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            runOnUiThread(new Runnable() {
                                public void run() {


                                    new AlertDialog.Builder(MainActivity.this)
                                            .setTitle("File Download")
                                            .setMessage("File Downloaded Successfully!!!")
                                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                                public void onClick(DialogInterface dialog, int which) {

                                                }
                                            })
                                            .show();
                                }
                            });
                            progressBar.dismiss();
                        }
                    }
                }).start();