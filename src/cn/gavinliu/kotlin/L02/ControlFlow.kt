package cn.gavinliu.kotlin.L02

/**
 * Created by Gavin on 2017/05/31.
 */

fun ifx(a: Int, b: Int): Int {
    var max = 0
    if (a > b) {
        max = a
    } else {
        max = b
    }
    return max
}

fun ifxx(a: Int, b: Int) = if (a > b) a else b

fun ifxxx(a: Int, b: Int): Int {
    val max = if (a > b) {
        print("Choose a = ")
        a
    } else {
        print("Choose b = ")
        b
    }
    return max
}

fun whenX(a: Int) {
    when (a) {
        0, 1 -> println("a = 1")
        in 2..10 -> println("a = 2 ~ 10")
        !in 10..20 -> println("!a = 10 ~ 20")
        else -> println("other")
    }
}

fun check(x: Any) = when (x) {
    is String -> x.startsWith("x")
    else -> false
}

fun main(args: Array<String>) {
    println(ifx(1, 2))
    println(ifxx(2, 3))
    println(ifxxx(4, 5))

    whenX(1)
    whenX(4)
    whenX(14)
    whenX(21)

    println(check("xx"))
    println(check("123"))
    println(check(1))

    val asc = Array(5, { i -> (i * i).toString() })

    for (a in asc) {
        println(a)
    }

}
