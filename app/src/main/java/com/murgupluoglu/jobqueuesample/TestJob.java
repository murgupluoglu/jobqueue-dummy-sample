package com.murgupluoglu.jobqueuesample;

import android.support.annotation.Nullable;
import android.util.Log;

import com.birbit.android.jobqueue.CancelReason;
import com.birbit.android.jobqueue.Job;
import com.birbit.android.jobqueue.Params;
import com.birbit.android.jobqueue.RetryConstraint;

/**
 * Created by mustafa.urgupluoglu on 2/8/18.
 */

public class TestJob extends Job {

    public TestJob() {
        //use singleWith so that if the same job has already been added and is not yet running,
        //it will only run once.
        //.singleInstanceBy("fetch-test")
        super(new Params(0).requireNetwork().groupBy("fetch-test"));
    }

    @Override
    public void onAdded() {

    }

    @Override
    public void onRun() throws Throwable {
        Thread.sleep(5 * 1000);
        Log.e("isDone", "TIME::" + System.currentTimeMillis());
    }

    @Override
    protected void onCancel(@CancelReason int cancelReason, @Nullable Throwable throwable) {

    }

    @Override
    protected RetryConstraint shouldReRunOnThrowable(Throwable throwable, int runCount,
                                                     int maxRunCount) {
        return RetryConstraint.RETRY;
    }
}
