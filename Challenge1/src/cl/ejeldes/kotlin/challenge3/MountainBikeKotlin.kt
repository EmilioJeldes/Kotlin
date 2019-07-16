package cl.ejeldes.kotlin.challenge3

/**
 * Created by ejeldes on Jul 16, 2019
 */
class MountainBikeKotlin(cadence: Int, gear: Int, speed: Int, var seatHeight: Int) :
    BicycleKotlin(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}