package com.example.horizontalprogressbar;
import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.os.Bundle;
// Handler Package
import android.os.Handler;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity
{
    // Progress Bar Variables
    private final Handler progressBarHandler = new Handler();
    private int progressBarStatus = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button launchProgressBar = findViewById(R.id.btn);
        launchProgressBar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ProgressDialog progressBar = new ProgressDialog(MainActivity.this);
                progressBar.setMessage("File downloading ...");
                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressBar.setCancelable(true);
                progressBar.setProgress(0);
                progressBar.setMax(100);
                progressBar.show();
                new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        for(progressBarStatus = 0; progressBarStatus <= 100; progressBarStatus+=10)
                        {
                            try
                            {
                                Thread.sleep(300);
                            }
                            catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                            progressBarHandler.post(new Runnable()
                            {
                                public void run()
                                {
                                    progressBar.setProgress(progressBarStatus);
                                }
                            });
                        }
                    }
                }).start();
            }
        });
    }
}
