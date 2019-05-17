package com.jackie.kotlinday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //    var tv: TextView
    lateinit var tv: TextView
    val a =10;
    val b = 2;

    override fun onCreate(savedInstanceState: Bundle?) {//加"?"表示可以围null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.tv)
        tv.text = "hello"
        val s = "hello world"

        tv.setOnClickListener { tv.text="${s.replace("l","o")}"}//"${forAdd(10)}" }

    }

    fun add(a:Int,b:Int):Int{
        return a+b
    }

    fun forAdd(a:Int):Int{
        var b:Int = 0;
        for(i in 1..a){
            b+=i
        }
        return b
    }
    override fun onResume() {
        super.onResume()
    }
}
