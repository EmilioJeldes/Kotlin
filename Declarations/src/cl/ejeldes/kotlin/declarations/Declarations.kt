package cl.ejeldes.kotlin.declarations

/**
 * Created by ejeldes on Jul 06, 2019
 */

/*
* TypeAlias
* */

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    // val is immutable
    // var is mutable
    var number: Int

    number = 10
    number = 11

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane Smith", 400)
    } else {
        employee2 = Employee("Mike Watson", 150)
    }

    /*
        typealias can be used
    */
    val employees: EmployeeSet

    /*
    * Collections access
    * */
    val names = arrayListOf("Jhon", "Jane", "Mary")
    println(names[1])

    /*
    * Ternary Operators do not exist in Kotlin. Just if statements
    * */

    /*
    * Normal for loops do not exist. for (int i = 0; i < 20; i++)
    * */

    /*
    * Kotlin do not have static keyword
    * */

    /*
    * Kotlin do not have a new keyword
    * */

    /*
    * Equality
    * ==  compare structure equality
    * === compare referential equality
    * !=  structure not equal
    * !== referentially not equal
    * */

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("Mary", 2)
    val employeeThree = Employee("Mary", 2)
    val employeeFour = employeeTwo

    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)
    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)
    println(employeeTwo === employeeFour)

    /*
    * || = or
    * && = and
    * */

    /*
    * Casting
    * No need for explicit casting if is done an "is" check
    * if needed, its done using the keyworkd "as"
    * */
    val something: Any = employeeFour

    if (something is Employee) {
//        val newEmployee = something as Employee
        println(something.name)
    }

    /*
    * Overridde toString using string template
    * $variable
    * */
    println(employee1)

    /*
    * String template instead of concatenation
    * */
    val change = 4.22
    println("Your change is $$change")

    /*
    * You can substitute an expression inside a string template
    * */
    val numerator = 10.9
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator / denominator}")

    /*
    * Raw Strings
    * */
    val filePath = """c:\somedir\somedir2"""
    val eggName = "Humpty"
    val nurseryRhyme = """
                        |$eggName Dumpty sat on the wall
                        |$eggName Dumpty had a great fall
                        |All the king's horses and all the king's men
                        |Couldn't put $eggName together again.""".trimMargin()
    println(nurseryRhyme)
}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}