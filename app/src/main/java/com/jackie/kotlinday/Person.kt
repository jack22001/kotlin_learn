package com.jackie.kotlinday

class Person constructor(name:String) {
    lateinit var name:String
    var height:Int = 100
        get() = field
        set(value) {
            if(value>200)
                field = 180
            else
                field = value
        }
    init {
        this.name = name
    }

    constructor(name:String,height:Int) : this(name) {
        this.height = height
    }


}