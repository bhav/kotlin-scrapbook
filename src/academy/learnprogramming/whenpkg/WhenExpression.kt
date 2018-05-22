package academy.learnprogramming.whenpkg

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>) {

    val num = 605

    when (num) {
        100, 600 -> println("600")
        in 601..699 -> println("100 to 199")
        100 -> println("200")
        100 -> println("300")
        else -> println("no match")
    }


    when (num) {
        100, 600 -> println("600")
        in 601..699 -> println("100 to 199")
        100 -> println("200")
        100 -> println("300")
        else -> println("no match")
    }

    val obj: Any = "im a string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45

    val something: Any = obj2
    val z = when (something) {
        is String -> println(something.toUpperCase())
        is BigDecimal -> something.remainder(BigDecimal(10.5))
        is Int -> something - 22
        else ->println("WTF")
    }

    //z is unit
    println(z)

    //Long way to do above
//    val something: Any = obj2
//    if (something is String) {
//        println(something.toUpperCase())
//    } else if (something is BigDecimal) {
//        println(something.remainder(BigDecimal(10.5)))
//    } else if (something is Int) {
//        println(something - 22)
//    }

    val timeOfYear = Season.WINTER

    val str = when (timeOfYear) {
        Season.SPRING -> "Tis spring"
        Season.SUMMER -> "Tis sunner"
        Season.FALL -> "tis fall"
        Season.WINTER -> "tis winter"
    }

    println(str)

}