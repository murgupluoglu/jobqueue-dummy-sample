package com.murgupluoglu.jobqueuesample;

import android.support.annotation.NonNull;

import com.birbit.android.jobqueue.JobManager;
import com.birbit.android.jobqueue.scheduling.GcmJobSchedulerService;

/**
 * Created by mustafa.urgupluoglu on 2/8/18.
 */

public class MyGcmJobService extends GcmJobSchedulerService {
    @NonNull
    @Override
    protected JobManager getJobManager() {
        return App .getInstance().getJobManager();
    }
}
