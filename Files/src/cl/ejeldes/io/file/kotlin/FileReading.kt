package cl.ejeldes.io.file.kotlin

import java.io.File

/**
 * Created by ejeldes on Aug 11, 2019
 */
fun main() {
    // same in java as
    //InputStreamReader inputStreamReader = new InputStreamReader(
    //                    new FileInputStream(new File("testfile.txt")), StandardCharsets.UTF_8);
    // This function takes all the lines in memory so is not good for huge files
    val lines = File("testfile.txt").reader().readLines()
    lines.forEach { println(it) }

    // readText() returns the entire file as a String but you have to close the reader
    // val reader = File("testfile.txt").reader()
    // val text: String = reader.readText()
    // reader.close()
    // The use() method closes the resource properly
    val text = File("testfile.txt").reader().use { it.readText() }
    println(text)

    val file = File("testfile.txt").bufferedReader().use {
        var line: String
        do {
            line = it.readLine()
        } while (!line.contains("3"))
        println("This is line $line")
    }
}