package cl.ejeldes.kotlin.loops

/**
 * Created by ejeldes on Jul 16, 2019
 */
fun main() {

    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)

    val backwardRange = 5.downTo(1)

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = range.reversed()

    reversedRange.forEach(::println)
    stepThree.forEach(::println)

    for (i in 1..20 step 4) {
        println(i)
    }

    val seasons = arrayOf("spring", "summer", "winter", "fall")
    val notInSeasons = "whatever" !in seasons

    // Get indices
    for (i in seasons.indices) {
        println("${seasons[i]} is season number $i")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }

}