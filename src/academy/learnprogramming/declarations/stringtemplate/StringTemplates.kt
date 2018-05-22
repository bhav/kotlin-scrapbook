package academy.learnprogramming.declarations.stringtemplate

import academy.learnprogramming.declarations.Employee

fun main(args: Array<String>) {
    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    println(employee1)

    val change = 4.22
    println("To show the value of change, we use $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    //If referencing anything outside the class use expression sytnax
    println("The employee name is ${employee1.name}")

    val filePath = """c:\somedir\somedire2""" //raw string escapes special characters. use tripe " to declare raw string

    //raw string works over multiple lines.

    val eggName = "Humpty"
    val nurseryRhyme = """$eggName Dumpty sat on the wall
         *Humpty dumpty had a great fall,
         *All the kings horses and all the kings men
                    Couldnt put $eggName together again

    """.trimMargin("*")
    println(nurseryRhyme)
}


class Employee(var name: String, val id : Int) {

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}