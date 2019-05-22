package com.jackie.kotlinday

class Student(name: String) : Person(name) {
    companion object {
        var age:Int = 3
    }
    override var height: Int
        get() = super.height
        set(value) {}
    override val content: String
        get() = super.content

    fun Animal.toString():String{
        if(this== null ) return "null"
        return toString()
    }
    fun Animal.add():Int{
        return 5;
    }
}