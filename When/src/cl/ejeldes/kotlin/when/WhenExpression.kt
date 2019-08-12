package cl.ejeldes.kotlin.`when`

import java.math.BigDecimal

/**
 * Created by ejeldes on Jul 16, 2019
 */

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main() {

    val mySeason = Season.SUMMER

    val str: String = getSeasonComment(mySeason)

    println("*****************************\n* $str\n*****************************")

    val str2: String = getNumberPrint(10, 20)
    println("*****************************\n* $str2\n*****************************")

    val num = 100

    when (num) {
        100, 600 -> println("100 or 600")
        in 200..299 -> println("in 200 to 299 range")
        300 -> println("300")
        400 -> println("400")
        else -> println("Doesn't match anything")
    }

    val y = 10

    when (num) {
        y + 80 -> println("90")
        y + 90 -> println("90")
        else -> println("Doesn't match anything")
    }

    val obj1: Any = "Some nice String"
    val obj2: Any = BigDecimal(22.19)
    val obj3: Any = 45

    val something: Any = obj3

    val x = when (something) {
        is String -> println(something.toUpperCase())
        is BigDecimal -> println(something.remainder(BigDecimal(10.5)))
        is Int -> println("${something - 22}")
        else -> println("I have no idea what type is it")
    }
}

fun getSeasonComment(season: Season): String = when (season) {
    Season.SPRING -> "Flowers are blooming"
    Season.FALL -> "It's getting cooler"
    Season.WINTER -> "I need a coat"
    Season.SUMMER -> "It's hot!"
}

fun getNumberPrint(num1: Int, num2: Int): String = when {
    num1 > num2 -> "num1 is greater than num2"
    num1 < num2 -> "num1 is lower than num2"
    else -> "num1 == num2"
}