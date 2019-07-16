package cl.ejeldes.kotlin.oop

/**
 * Created by ejeldes on Jul 14, 2019
 */
fun main() {

    val emp = Employee("John")
    println(emp.firstName)

    val emp2 = Employee("John")
    println(emp2)
    println(emp2.firstName)

    // You don't need to create constants in a class
    println(MY_CONSTANT)

    // Data class
    val car = Car("Blue", "Toyota", 2017)
    val car2 = Car("Blue", "Toyota", 2017)
    println(car)
    println(car == car2)
    println(emp == emp2)

    val car3 = car.copy()
    val car4 = car.copy(year = 2016, color = "Green")

}

/**
 * Same as
 * class Employee constructor(firstName: String) {
 *
 *    val firstName: String
 *
 *    init {
 *        this.firstName = firstName
 *    }
 * }
 *
 * If you need to change the visibility of the constructor, you have to put the word constructor
 * class Employee protected constructor(val firstName: String)
 */
class Employee(val firstName: String, var fullTime: Boolean = true) {

//    var fullTime: Boolean = true
//
//    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
//        this.fullTime = fullTime
//    }

    override fun equals(other: Any?): Boolean {
        return if (other is Employee) other.firstName == firstName else false
    }

}

/**
 * Data class have some extra functionality for free.
 *  - Nice toString function
 *  - custom equals and hash functions (already implemented)
 *  - and a copy function
 */
data class Car(val color: String, val model: String, val year: Int)



