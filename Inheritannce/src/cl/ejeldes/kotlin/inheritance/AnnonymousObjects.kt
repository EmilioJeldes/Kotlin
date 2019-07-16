package cl.ejeldes.kotlin.inheritance

/**
 * Created by ejeldes on Jul 16, 2019
 */
fun main() {

    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String = "implementing: $num"
    })
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing someinterface ${si.mustImplement(22)}")
}