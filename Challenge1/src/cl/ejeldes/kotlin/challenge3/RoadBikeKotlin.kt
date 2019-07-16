package cl.ejeldes.kotlin.challenge3

/**
 * Created by ejeldes on Jul 16, 2019
 */
class RoadBikeKotlin(val tireWidth: Int, cadence: Int, gear: Int, speed: Int) :
    BicycleKotlin(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}