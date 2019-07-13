package cl.ejeldes.kotlin.datatypes

import cl.ejeldes.java.datatypes.DummyType
import java.math.BigDecimal

/**
 * Created by ejeldes on Jul 10, 2019
 */

fun main() {

    // Assign int values
    // Default type for numbers is Int
    // If you want a short, float, long, etc .. you need to explicitly assign it
    val myInt = 20

    var myLong = 20L

    // To assign an int to a long, you have to explicitly convert it
    myLong = myInt.toLong()

    var myShort: Short = 12324

    val myByte: Byte = 127

    myShort = myByte.toShort()


    // Doubles
    val myDouble = 65.07
    println("My double is double: ${myDouble is Double}")

    // Float
    val myFloat = 20.984f
    println("myFloat is float: ${myFloat is Float}")

    // Java code and primitive types
    val isOnVacation = false
    val onVacation = DummyType().isVacationTime(isOnVacation)
    println(onVacation)

    // Arrays
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)

    val longs3 = arrayOf(1, 2, 3)

    println(longs1[2])

    val evenNumbers = Array(16) { i -> i * 2 }

    for (number in evenNumbers) {
        println(number)
    }

    val lotsOfNumbers = Array(100000) { i -> i + 1 }

    val allZeroes = Array(100) { 0 }

    var someArray: Array<Int>

    someArray = arrayOf(1, 2, 3, 4)

    for (number in someArray) {
        println(number)
    }

    someArray = Array(6) { i -> (i + 1) * 10 }

    for (number in someArray) println(number)

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')

    for (element in mixedArray) {
        println(element)
    }

    println(mixedArray is Array)

    val myIntArray = intArrayOf(3, 6, 7, 8, 4)

    DummyType().printNumbers(myIntArray)
    DummyType().printNumbers(evenNumbers.toIntArray())

    var someOtherArray = IntArray(5)

    someOtherArray.forEach { println(it) }


}