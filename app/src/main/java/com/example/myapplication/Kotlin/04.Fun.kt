package com.example.myapplication.Kotlin

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기 Unit => void 란 뜻! 생략도 가능!
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

//생략도 가능!
fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second


// 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers : Int){
    for (number in numbers){
        println(number)
    }
}
fun main() {
    println(plus(3, 10))
//    인수를 명시적으로 전달하는 방법
    val result = plus(first = 20, second = 30)
    println(result)

    val result2 = plusFive(10, 20)
    println(result2)
    val result3 = plusFive(10)      // 하나만 적어줘도 됨!
    println(result3)

    printPlus(5, 7)
    printPlus2(1, 2)

    println(plusShort(3, 3))

    plusMany(1,2,3,4,5)
}