package com.murgupluoglu.jobqueuesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.birbit.android.jobqueue.JobManager;

public class MainActivity extends AppCompatActivity {

    private JobManager jobManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jobManager = App.getInstance().getJobManager();

        jobManager.addJobInBackground(new TestJob());
        jobManager.addJobInBackground(new TestJob());
        jobManager.addJobInBackground(new TestJob());
        jobManager.addJobInBackground(new TestJob());
        jobManager.addJobInBackground(new TestJob());
    }
}
