package cl.ejeldes.kotlin.inheritance

import java.time.Year

/**
 * Created by ejeldes on Jul 16, 2019
 */

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    /**
     * Accessing companion objects
     */
    println(SomeClass.Companion.accessPrivateVar())
    println(SomeClass.accessPrivateVar())

    /**
     * Factory pattern example using companion objects
     */
    val factory1 = FactoryExample.justAssign("This is the string as is")
    val factory2 = FactoryExample.upperOrLowerCase("This isn't the string as is", false)

    println(factory1.someString)
    println(factory2.someString)

    /**
     * Enums
     */
    println(Department.ACCOUNTING.getDeptInfo())
    println(Department.ACCOUNTING)
}

/**
 * Singleton
 */
object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved"

}

/**
 * Companion objects
 */
class SomeClass {

    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I'm accesing privateVar: $privateVar"
    }
}

class FactoryExample private constructor(val someString: String) {

    companion object {

        fun justAssign(str: String) = FactoryExample(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): FactoryExample {
            if (lowerCase) {
                return FactoryExample(str.toLowerCase())
            } else {
                return FactoryExample(str.toUpperCase())
            }
        }
    }

    fun getSomeStringModification() = "$someString!!!"
}

/**
 * Enums
 */
enum class Department(val fullName: String, val numEmployee: Int) {

    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20);

    fun getDeptInfo() = "The $fullName has $numEmployee employees"

}