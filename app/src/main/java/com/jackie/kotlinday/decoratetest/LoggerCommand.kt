package com.jackie.kotlinday.decoratetest

import android.util.Log

//构造器 constructor省略
class LoggerCommand(command:Command) :Command {
    var com:Command = command
    override fun excute() {
        Log.e("JACKIE","logCommand")
        com.excute()
    }
}