package cl.ejeldes.kotlin.nullreferences

import cl.ejeldes.kotlin.model.Bank

/**
 * Created by ejeldes on Jul 13, 2019
 */


fun main() {


    // STR
    val str: String? = null

    println("What happens when we do this: ${str?.capitalize() ?: "Wena"}")

    val myBank: Bank? = null

    val countryCode: Int? = myBank?.address?.country?.countryCode ?: 100

    println(countryCode)

    val str2 = str?.toUpperCase()

    /*
        val str2 = str!!.toUpperCase()

        Java Representation
        if (str == null) {
            throw new NullPointerException()
        } else {
            str.toUpperCase()
        }

     */

    /**
     * What if i need to execute a piece of code only if the reference is not null
     *
     * val str2 = str!!.toUpperCase()
     *
     * in this case we are assign it so we can now. But what if we are using a library
     * We can't be 100% sure that the documentation it would be trusted
     */

    // We can check it like this
    str?.let { printText(it) }


}

fun printText(text: String) {
    println(text)
}