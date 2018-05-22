package academy.learnprogramming.challenge7

fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val peopleMap = mapOf(
            "Jones" to joe,
            "Smith" to jane,
            "Wilson" to mary,
            "Adams" to john,
            "Smithson" to jean)

    println("Last names beginning with 'S': ${peopleMap.values.filter { it.lastName.startsWith("S") }.count()}")
    println(peopleMap.map { Pair(it.value.firstName, it.value.lastName) })


    peopleMap.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    val (fname, lname, age) = joe
    println("fName = $fname, lName = $lname, age = $age")

    val list1 = listOf(1,4,9,15,33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)
    //val list3 = list1.asSequence().filter { list2.contains(it) }.toList()
    val list3 = list1.filter {it in list2}
    println(list3)


    val regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    paper = regularPaper
}

data class Person(val firstName: String, val lastName:String, val age:Int)

class Box<out T> {

}

open class Paper {

}

class Regular:Paper() {

}

class Premium:Paper() {

}