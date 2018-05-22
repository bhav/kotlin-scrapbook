package adademy.learnprogramming.functions

fun main(args: Array<String>) {

    println(labelMultiply(label= "Heres the result", operand2 = 2, operand1 = 3))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car = Car("red", "Ford", 2015)
    val car2 = Car("blue", "Ford", 2015)
    val car3 = Car("green", "Ford", 2015)

    printcolours(car, car2, car3, str = "Colour :")


    val manyCars = arrayOf(car, car2, car3)
    printcolours(*manyCars,  str = "Colour :")

    val moreCars = arrayOf(car2, car3)
    val car4 = Car("blue", "Ford", 2015)
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    for (c in lotsOfCars) {
        println(c)
    }

    val s = "this is all in lowercase"
    println(Utils().upperFirstAndLast(s))

    //also
    println(s.upperFirstAndLast())


}

//fun labelMultiply(operand1: Int, operand2: Int, label:String) : String {
//    return ("$label ${operand1 * operand2}")
//}

//also simplified
fun labelMultiply(operand1: Int, operand2: Int, label:String = "The answer is: ") = "$label ${operand1 * operand2}"

//Inline functions. An inline functions body is compiled to bytecode from whereever the function is called. 'so you're not actually calling the function, - (basically the function call is replaced by the body of the inline function - performance gains when dealing with lambdas!)

//
fun whatever(): Int = 3 * 4

fun printcolours(vararg  cars: Car, str: String) {
    for (car in cars) {
        println("$str ${car.colour}")
    }
}

//extension function illusion - as if we're extending String :-)
//recieveer type is String, reciever object is the 'upperFirstAndLast()'
fun String.upperFirstAndLast(): String {
    val upperFirst = this.substring(0,1).toUpperCase() + this.substring(1) //also works without the 'this'
    return upperFirst.substring(0, upperFirst.length -1) + upperFirst.substring(upperFirst.length -1, upperFirst.length).toUpperCase()


}

class Employee(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase()
}


data class Car(val colour: String, val model:String, val year:Int)
