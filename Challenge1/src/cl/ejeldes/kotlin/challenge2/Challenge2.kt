package cl.ejeldes.kotlin.challenge2

/**
 * Created by ejeldes on Jul 13, 2019
 */
fun main() {

    // 1. Declare a non-nullable float variable two ways, and
    // assign it the value -3847.384
    var floatNumber: Float?
    floatNumber = -3847.384f

    // 2. Now change both of those variable declarations into nullable variables.


    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // amd assign it the values 1, 2, 3, 4, and 5
    val shorArray = arrayOf<Short>(1, 2, 3, 4, 5)

    // 4.Now declara ana array of nullable Ints and initialize it with the values
    // 5, 10, 15,, 20, 25, 30, 35, 40, 50, etc., all the way up to 200
    val intArray = Array<Int?>(40) { i -> (i + 1) * 5 }

    // 5. You have to call Java method with the following signature from Kotlin:
    // public void method(char[] charArray). Declare an array than you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'
    val charArray = charArrayOf('a', 'b', 'c')

    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null
    val anotherString = x?.toLowerCase() ?: "I give up!"

    x?.let { println(it.toLowerCase().replace("am", "am not")) }

    // 7. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // Change the following code assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullableVariable: Int? = null
    myNonNullableVariable!!.toDouble()

}