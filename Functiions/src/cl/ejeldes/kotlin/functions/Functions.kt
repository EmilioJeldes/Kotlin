package cl.ejeldes.kotlin.functions

/**
 * Created by ejeldes on Jul 16, 2019
 */
fun main() {
    println(labelMultiply(3, 4))

    val person = Person("Jane")
    println(person.upperCaseFirstName())
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

data class Person(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase()

}


