package academy.learnprogramming.academy.learnprogramming.trycatch

fun main(args: Array<String>) {
    println(getNumber("22.5"))

    println(getNumberNull("22.5") ?: throw  IllegalArgumentException("Number isnt an int"))

}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    }
    catch (e: NumberFormatException) {
        0
    } finally {
        println("Im in the finally")
        1
    }
}


fun getNumberNull(str: String): Int? {
    return try {
        Integer.parseInt(str)
    }
    catch (e: NumberFormatException) {
        null
    } finally {
        println("Im in the finally")
        1
    }
}