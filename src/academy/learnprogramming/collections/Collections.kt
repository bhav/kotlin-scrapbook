package academy.learnprogramming.collections

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val arraylist =  arrayListOf(1,2,4)
    println(arraylist.javaClass)

    val mutableList = mutableListOf<Int>(1,2,3)
    println(mutableList.javaClass)

    val array = arrayOf("black", "white", "green")
    val colorList = listOf(array)
    val colorListSpread = listOf(*array)
    val colorListEasier = array.toList()
    println(colorList)
    println(colorListSpread)
    println(colorListEasier)

}
