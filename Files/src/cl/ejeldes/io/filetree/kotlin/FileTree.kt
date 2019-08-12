package cl.ejeldes.io.filetree.kotlin

import java.io.File

/**
 * Created by ejeldes on Aug 11, 2019
 */
fun main() {
    File(".")
        .walkTopDown()
        .filter { it.name.endsWith(".kt") }
        .forEach { println(it) }
}