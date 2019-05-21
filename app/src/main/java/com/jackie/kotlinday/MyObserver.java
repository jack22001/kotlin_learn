package com.jackie.kotlinday;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.*;

public class MyObserver implements LifecycleObserver {
//    @Override
//    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
//        switch (event){
//            case ON_CREATE:
//                Log.e("jackie", "oncreate");
//                break;
//            case ON_START:
//                Log.e("jackie", "onstart");
//                break;
//            case ON_RESUME:
//                Log.e("jackie", "onresume");
//                break;
//                default:
//
//
//        }

//    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate(@NonNull LifecycleOwner owner){
        Log.e("jackie", "oncreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause(@NonNull LifecycleOwner owner){
        Log.e("jackie", "onpause");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume(@NonNull LifecycleOwner owner){
        Log.e("jackie", "onresume");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void onAny(@NonNull LifecycleOwner owner){
        Log.e("jackie", "onAny");
    }
}
