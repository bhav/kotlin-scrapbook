package academy.learnprogramming.lamdas

fun main(args: Array<String>) {
    //run {println("Im in a lamda")}

    val employees = listOf(Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002)

    )

    //println(employees.minBy { e -> e.startYear })
    //println(employees.minBy { it.startYear })

    //Also if the lambda is only referencing a property and not doing anything with it, we can use member reference.
    println(employees.minBy(Employee::startYear))

    var num = 10

    run {
        num+=15
        println(num)
    }

    run{(::topLevel)("hello","Bob")}
}

fun topLevel(message: String, otherMessage: String) = println(message + "Im a function")

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)