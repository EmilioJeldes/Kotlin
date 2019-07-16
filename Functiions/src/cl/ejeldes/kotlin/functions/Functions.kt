package cl.ejeldes.kotlin.functions

/**
 * Created by ejeldes on Jul 16, 2019
 */
fun main() {
    println(labelMultiply(3, 4))

    val employee = Employee("Jane")
    println(employee.upperCaseFirstName())

    val car1 = Car("blue", "toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("grey", "Ford", 2017)

    printColors(car1, car2, car3, str = "Color: ")

    val manyCars = arrayOf(car1, car2, car3)

    /**
     * Spread Operator
     * It unpacks the array
     */
    printColors(*manyCars)

    val moreCars = arrayOf(car2, car3)
    val car4 = car1.copy()

    val allCars = arrayOf(*manyCars, *moreCars, car4)

    /**
     * Using extensions functions
     */
    println("this is all in lowercase".upperFirstAndLast())

}

/**
 * By default it returns Unit (like void)
 * In this case returns a String
 */
fun labelMultiply(operand1: Int, operand2: Int, label: String = "The result is:"): String {
    return "$label ${operand1 * operand2}"
}

/**
 * Same as above
 */
fun labelMultipl(operand1: Int, operand2: Int, label: String) = "$label ${operand1 * operand2}"

/**
 * If vargarg is at the end, you do not have to pass the param name when using it
 */
fun printColors(vararg cars: Car, str: String = "Color: ") {
    print(str)
    for (car in cars) {
        print("${car.color}${if (cars.last() != car) ", " else "\n"}")
    }
}

/*
    EXTENSION FUNCTIONS
 */
fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) + upperFirst.substring(
        upperFirst.length - 1,
        upperFirst.length
    ).toUpperCase()
}


/*
    DATA STRUCTURES
 */
data class Employee(val firstName: String) {

    /**
     * Method
     */
    fun upperCaseFirstName() = firstName.toUpperCase()

}

data class Car(val color: String, val model: String, val year: Int)


