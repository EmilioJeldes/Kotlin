package cl.ejeldes.io.binary

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

/**
 * Created by ejeldes on Aug 11, 2019
 */
fun main() {
    val dataInput = DataInputStream(FileInputStream("testfile.bin"))
    var data: String

    try {
        while (true) {
            data = dataInput.readUTF()
            println(data)
        }
    } catch (e: EOFException) {

    }

}