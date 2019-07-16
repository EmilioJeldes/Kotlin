package cl.ejeldes.kotlin.inheritance

/**
 * Created by ejeldes on Jul 16, 2019
 */

fun main() {
    val laserPrinter = LaserPrinter("1234", 15)
    laserPrinter.printModel()
}

abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {
    override fun bestSellingPrice(): Double = 129.00

    /**
     * Final to avoid open behaviour
     */
    final override fun printModel() = println("The mode of the laser printer is $modelName")
}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm)


open class Something(val x: Int) {

    var someProperty: String = "Something"

    constructor(someParameter: String, x: Int) : this(x) {
        this.someProperty = someParameter
    }
}

class SomethingElse : Something {
    constructor(some: Int) : super(some)
    constructor(someOtherParameter: String, some: Int) : super(someOtherParameter, some)
}

/**
 * ITERFACES
 *
 * extendable by default
 */
interface MyInterface {

    val number: Int
    val number2: Int
        get() = 2 + 2

    fun myFunction(str: String): String
}

interface MySubInterface : MyInterface {

    fun mySubFunction(int: Int): String
}

class InterfaceImpl(override val number: Int) : MySubInterface {

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(int: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}