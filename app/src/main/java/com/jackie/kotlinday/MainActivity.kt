package com.jackie.kotlinday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //    var tv: TextView
    lateinit var tv: TextView
    lateinit var show: TextView
    val a = 10
    val b = 2
    lateinit var myObs: MyObserver
    var ab = listOf("ad", "ddd", "eee")
    var sInt = listOf(1, 2, 3, 4, 5)
    lateinit var person1:Person
    lateinit var person2:Person
    lateinit var stu1:Student

    override fun onCreate(savedInstanceState: Bundle?) {//加"?"表示可以围null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.tv)
        show = findViewById(R.id.showText);
        tv.text = "hello"
        val s = "hello world"

//        tv.setOnClickListener { show.text="${s.replace("l","o")}"}//"${forAdd(10)}" }
//        tv.setOnClickListener { show.text = tTable().toString() }
        tv.setOnClickListener { show.text = Student.age.toString()}
        myObs = MyObserver()
        lifecycle.addObserver(myObs)
        ab.indices

        person1 = Person("zhangsan")
        person2 = Person("zhangsi",178)

        show.text=person1.name

    }

    fun Person.showName():String{
        return "ddfdf"
    }
    fun tTable(): Int {
        var sum: Int = 0;
        sInt.forEach ss@{
            if (it == 2) return@ss
            sum += it
        }
        return sum
    }

    fun tFor(): String {
        var s: String = ""
//        for(ss in ab.indices){
//            s += ab[ss]
//        }
//        repeat(ab.size){
//            s += ab.get(it)
//        }
        ab.forEach { s += it }
//        for((index,value) in ab.withIndex()){
//            s += value;
//        }
        return s
    }

    fun tIf(): String {
        if (a in 2..9) return "$a in 2..9"
        else return "not in"
    }

    fun tWhen(x: Int): String {
        var r: String = "null"
        when (x) {
            1, 2, 3 -> r = "in mode"
            in 4..9 -> r = "in 4..9"
            !in 20..50 -> r = "not in 20..50"
//            is Int ->x.and(5)
            else -> {
                r = "else"
            }
        }
        return r
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    override fun onPause() {
        super.onPause()
    }


    fun forAdd(a: Int): Int {
        var b: Int = 0;
        for (i in 1..a) {
            b += i
        }
        return b
    }

    override fun onResume() {
        super.onResume()
    }
}
