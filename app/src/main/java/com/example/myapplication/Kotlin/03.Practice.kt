package com.example.myapplication.Kotlin

// 정수형 -> Long > Int > Short > Byte
// 실수형 -> Double > Float

var a = 1+ 2+ 3+ 4+ 5
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null - 존재하지 않는다. "null" (x)

//var abc : Int = null
var abc : Int? = null

fun main() {
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc)
}