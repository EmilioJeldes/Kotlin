package cl.ejeldes.kotlin.nullreferences

/**
 * Created by ejeldes on Jul 13, 2019
 */
fun main() {

    val nullableInts = arrayOfNulls<Int>(5)

    for (i in nullableInts) {
        println(i)
    }

    println(nullableInts[3].toString())

}