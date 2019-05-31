package com.jackie.kotlinday.model

import android.os.SystemClock
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class LiveDataTestViewModel : ViewModel() {
    //    var elapsedTime:MutableLiveData<Long> = MutableLiveData<Long>()
//    var initTime:Long = SystemClock.elapsedRealtime()
//    var One_Second = 1000
//    init {
//        var timer:Timer = Timer()
////        timer.scheduleAtFixedRate(,One_Second,One_Second)
//
//    }
//    val currentName: MutableLiveData<String> by lazy {
//        MutableLiveData<String>()
//    }
    val currentPro: MutableLiveData<Product> by lazy {
        MutableLiveData<Product>()
    }
}