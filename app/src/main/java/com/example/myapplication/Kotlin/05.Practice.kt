package com.example.myapplication.Kotlin

fun plusThree(first:Int, second:Int, third:Int) : Int{
    val result = first + second + third
    return result
}

// 내부 함수
// - 함수 안에 함수가 있다.
fun showMyPlus(first: Int, second: Int): Int{
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int{
        return first + second
    }
    return plus(first, second)
}