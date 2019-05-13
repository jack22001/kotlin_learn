package com.jackie.kotlinday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //    var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {//加"?"表示可以围null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv).text = "hello world"
    }

}
