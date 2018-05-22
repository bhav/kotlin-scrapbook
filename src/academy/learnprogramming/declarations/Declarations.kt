package academy.learnprogramming.declarations

typealias EmployeeSet = Set<academy.learnprogramming.declarations.stringtemplate.Employee>

fun main(args: Array<String>) {
    var number: Int
    number = 10
    number = 20

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)
    val employeeFour = employeeTwo

    //referential equality i.e (== in java)
    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)


    //structural equality (.equals in Java, == calls .equals() in Kotlin)
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)
    println(employeeOne.equals(employeeTwo))
    println(employeeTwo.equals(employeeThree))
    println(employeeFour === employeeTwo)

    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)


    val x = 0x00101010
    val y = 0x00001010

    println("bitwise op" + (x and y))

    val something:Any = employeeFour
    if (something is academy.learnprogramming.declarations.stringtemplate.Employee) {
        //val newEmployee = something as Employee //Kotlin compiler has smart casting... in this case it knows something is an Employee
        println(something.name)
    }


//    val names = arrayListOf("John", "Jane", "Mary")
//    println(names[1])
//
//    val employees: EmployeeSet
//
//    val employee1 = Employee("Lynn Jones", 500)
//    employee1.name = "Lynn Smith"
//
//    val employee2 : Employee
//    val number2 = 100
//
//    if (number < number2) {
//        employee2 = Employee("Jane Simth", 400)
//    } else {
//        employee2 = Employee("Jane Simth", 150)
//    }


}

class Employee(var name: String, val id : Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is academy.learnprogramming.declarations.stringtemplate.Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

}