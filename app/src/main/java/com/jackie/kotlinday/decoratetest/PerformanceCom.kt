package com.jackie.kotlinday.decoratetest

import android.util.Log

class PerformanceCom(command:Command):Command {
    var com:Command = command
    override fun excute() {
        Log.e("jackie","performance")
        com.excute()
    }
}