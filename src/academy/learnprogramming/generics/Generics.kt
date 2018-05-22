package academy.learnprogramming.generics

fun main(args: Array<String>) {
    val list = mutableListOf<String>("Helo", "Some other thing")
    list[0].toUpperCase()
    printCollection(list)

    val listInts = mutableListOf<Int>(1,2,24)
    listInts.printCollectionExtFunction()

}


fun <T> printCollection(items: List<T>) {
    for (item in items) {
        println(item)
    }

}
//as ext function
fun <T> List<T>.printCollectionExtFunction() {
    for (item in this) {
        println(item)
    }

}