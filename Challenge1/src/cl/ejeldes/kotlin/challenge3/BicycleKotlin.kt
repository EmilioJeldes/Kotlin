package cl.ejeldes.kotlin.challenge3

/**
 * Created by ejeldes on Jul 16, 2019
 */
open class BicycleKotlin(var cadence: Int, var gear: Int, var speed: Int) {

    fun speedUp(decrement: Int) {
        speed -= decrement
    }

    fun applyBrake(increment: Int) {
        speed += increment
    }

    open fun printDescription() =
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")

}
