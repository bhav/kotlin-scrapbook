package academy.learnprogramming.challenge1

fun main(args: Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println(hello1 === hello2)

    println("hello1 and hello2 are structurally equal: ${hello1 == hello2}")

    var someInt = 2988

    val someAny: Any = "The Any type is the root of the Kotlin class hierarchy"
    if(someAny is String) {
        println(someAny.toUpperCase())
    }

    println("""1   1
                1  11
                1 111
                11111""".trimMargin("1"))




}