package com.anime.mangekyo;

import android.app.Application;
import android.os.Looper;
import android.util.Log;

interface ErrorBoundary {
    void uncaughtException(Thread thread, Throwable throwable);
}

public class MainApplication extends Application implements ErrorBoundary {

    @Override
    public void onCreate() {
        super.onCreate();
        setupExceptionHandler();
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        throwable.printStackTrace();
        Log.d("uncaughtException", throwable.getMessage());
        try {
            Looper.loop();
        } catch (Throwable t) {
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                uncaughtException(Looper.getMainLooper().getThread(), t);
            }
        }
    }

    public void setupExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this::uncaughtException);
    }
}
