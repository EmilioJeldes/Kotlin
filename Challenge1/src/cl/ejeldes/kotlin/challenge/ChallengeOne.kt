package cl.ejeldes.kotlin.challenge

/**
 * Created by ejeldes on Jul 07, 2019
 */

fun main() {
    // Declare two immutable String variables called hello1 and hello2. Assign "Hello"
    // to both variables
    val hello1 = "Hello"
    val hello2 = "Hello"

    // Using one line of code, test whether hello1 and hello2 are referentially equal
    // and print the result
    println("hello1 is referentially equal to hello2: ${if (hello1 === hello2) "yes" else "no"}")

    // Do the same thing as above, but test for structural equality
    println("hello1 is structurally equal to hello2: ${if (hello1 == hello2) "yes" else "no"}")

    // Declare a mutable variable type Int and assign it the value of 2988
    var number = 2988

    // Declare an immutable variable of type Any and assign the string "The Any time is the root
    // of the Kotlin class hierarchy. Then, a using smart cast print out the uppercased string
    val immutableVariable: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (immutableVariable is String) println(immutableVariable.toUpperCase())

    // Using one line of code, print out the following. Make sure your code is nicely idented
    //    1
    //   11
    //  111
    // 1111
    println("   1\n  11\n 111\n1111")
    println(
        """
        1   1
        1  11
        1 111
        11111
    """.trimMargin("1")
    )

}