package academy.learnprogramming.reified

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mixedList: List<Any> = listOf("df", 1, BigDecimal(22.5), "fsdf", BigDecimal(22.5))
    val bigDecimalsOnly = getElementsOfType<String>(mixedList)

    for (item in bigDecimalsOnly) {
        println(item)
    }
}

//doesn't work  - type erasure. Use inline functions and use reified params. When wanting to check against a generic type in a function, that is the only time you would use reification.
//fun <T> getElementsOfType(list: List<Any>): List<T> {
//
//    var newList: MutableList<T> = mutableListOf()
//    for (element in list) {
//        if (element is T) {
//            newList.add(element)
//        }
//    }
//    return newList
//}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {

    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }
    return newList
}