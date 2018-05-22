package upperbound

//Generic Types are ERASED - only a compile time aid. At run time JVM doesn't know anything about the generics
fun main(args: Array<String>) {

    val ints  = listOf(1,2,3,4,5)
    val shorts: List<Short?> = listOf(10,20,30,40)
    val floats: List<Float?> = listOf(10.3f,20.3f,30.34f,40.23f)
    val strings = listOf("1", "2", "3")

    if (strings is List<String>) {
        println("This is a list of strings")
    }

    val listAny: Any = listOf("str1", "str2")

    if (listAny is List<*>) {
        println("This is a list of strings")
    }

    convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)
    //convertToInt(strings)

    append(StringBuilder("String 1"), StringBuilder("String 2"))

}

fun <T> append(item1: T, item2: T)
where T: CharSequence, T: Appendable {
    println("Result is ${item1.append(item2)}")
}

fun <T: Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}

//By default, T is Any? meaning it's nullable. If you want to restrict the collection to have ONLY NON-NULLABLE types, you can just use T: Any

fun <T> printCollection(items: List<T>) {
    for (item in items) {
        println(item)
    }

}