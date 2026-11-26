package com.kameri.app.util;

import android.os.Handler;
import android.os.Looper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class AppExecutors {

    private static final ExecutorService BACKGROUND =
            Executors.newSingleThreadExecutor();

    private static final Handler MAIN =
            new Handler(Looper.getMainLooper());

    private AppExecutors() {
    }

    public static void runInBackground(Runnable task) {
        BACKGROUND.execute(task);//Fotoğraftaki baskın rengi hesapla
    }

    public static void runOnMain(Runnable task) {
        MAIN.post(task);
    }//bu rengi ekranda göster
}