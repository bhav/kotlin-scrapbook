package academy.learnprogramming.inheritance

import java.time.Year


fun main(args: Array<String>) {
    println(Department.ACCOUNTING.getDeptInfo())
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.SomeCompanion.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("Blask string")
    val someclass2 = SomeClass.upperorlowerCase("dfdsf", false)
    println(someClass1.sometString)
    println(someclass2.sometString)

    var thisIsMutable = 45

    //is an object expression!
    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }




})
    println(thisIsMutable)
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Res", 5), IT("Info Tech", 10), ACCOUNTING("Accounting", 2), SALES("Sales", 3);

    fun getDeptInfo() = "The $fullName department has $numEmployees"

}

//singletons, companion objects, and object experessions are use cases for Objects.
object CompanyCommunications {

    private val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks"

    internal fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved"

}

class SomeClass private constructor (val sometString: String) {
//    private val privateVar = 6
//
//    fun accessPrivateVar() {
//        println("Im accessing private var $privateVar")
//    }



    //Can think of everything inside a companion object as being static. Can access without an instance of container class.
    //can also be used to have private constructor.. aka Factory pattern
    companion object SomeCompanion {
        private var privateVar = 6

        fun accessPrivateVar() {
            println("Im accessing private var $privateVar")
        }

        fun justAssign(str: String) = SomeClass(str)
        fun upperorlowerCase(str: String, lowercase: Boolean): SomeClass {
            if (lowercase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }
    }

}

interface SomeInterface {
    fun mustImplement(num: Int) : String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}

fun someTopLevelFunction(str: String) = println("Top level function: $str")