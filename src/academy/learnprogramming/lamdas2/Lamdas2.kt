package academy.learnprogramming.lamdas2

fun main(args: Array<String>) {

    println(countTo100())
    val employees = listOf(Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002)

    )

    findByLastName(employees, "Wilson")
    findByLastName(employees, "nob")

    //labels come in handy in with and apply also.
    "Some String".apply OuterString@ {
        "AnotherString".apply {
            println(this.toUpperCase())
            println(this@OuterString.toUpperCase())
        }
    }

}

fun findByLastName(employees: List<Employee>, lastName: String)  {
//old fashioned way
//    for (employee in employees) {
//        if (employee.lastName == lastName) {
//            println("Yes, theres an employee with last name $lastName")
//            return
//        }
//    }
//    println("Nope, no employee found")

        employees.forEach {
            if (it.lastName == lastName) {
                println("Yes, theres an employee with last name $lastName")
                return
            }
        }
        println("Nope, no employee found")


}

fun countTo100() =

    StringBuilder().apply() {
        for (i in 1..99) {
            append(i)
            append(", ")
        }

        append(100)

    }.toString()





//fun countTo100() =
//
//    with(StringBuilder()) {
//        for (i in 1..99) {
//            append(i)
//            append(", ")
//        }
//
//        append(100)
//        toString()
//    }



//fun countTo100(): String {
//
//    return with(StringBuilder()) {
//        for (i in 1..99) {
//            append(i)
//            append(", ")
//        }
//
//        append(100)
//        toString()
//    }
//}

//fun countTo100(): String {
//    val numbers = StringBuilder()
//    for (i in 1..99) {
//        numbers.append(i)
//        numbers.append(", ")
//    }
//    numbers.append(100)
//    return numbers.toString()
//}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)