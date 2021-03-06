package com.menlopark.rentsyuser.di.module;

import android.app.Activity;
import android.content.Context;

import dagger.Module;
import dagger.Provides;


@Module
public class ActivityModule {
    private final Activity mActivity;

    public ActivityModule(Activity activity){
        mActivity = activity;
    }

    @Provides
    public Context activityContext(){
        return mActivity;
    }
}
