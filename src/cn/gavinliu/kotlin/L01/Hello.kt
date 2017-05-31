package cn.gavinliu.kotlin.L01

/**
 * Created by Gavin on 2017/05/23.
 */

fun main(args: Array<String>) {
    println("Hello, Kotlin!")

    println(sum(1, 2))
    println(sum2(1, 2))
    printSum(1, 2)

    val pi = 3.14
    println(pi)

    var x = 1
    val s = "x is $x"
    println(s)

    x = 2
    val str = "${s.replace("is", "was")}, but now is $x"
    println(str)

    println(maxOf2(2, 9))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int): Int = if (a > b) a else b
