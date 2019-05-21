package com.jackie.kotlinday

import android.util.Log
import androidx.annotation.NonNull
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class KObserver : LifecycleObserver{
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(owner:LifecycleOwner){
        Log.e("jackie","oncreate")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(owner:LifecycleOwner){
        Log.e("jackie","onResume")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(owner:LifecycleOwner){
        Log.e("jackie","ondestroy")
    }
}