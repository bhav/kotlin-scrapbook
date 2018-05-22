package academy.learnprogramming.lists

fun main(args: Array<String>) {

    val strings = listOf("spring", "summer", "fall", "summer", "winter")
    val colorList = listOf("black", "white", "red", "black", "red")

    println(strings.last())
    println(strings.asReversed())

    if (strings.size > 5) {
        println(strings[5])
    }

    println(strings.getOrNull(5)) //returns null rather than throw an exception

    val ints = listOf(1,2,3,4,5)
    println(ints.max())

    println(colorList.zip(strings))

    val mergedLists = listOf(colorList, strings)
    println(mergedLists)

    val combinedList = colorList + strings
    println(combinedList)

    val noDupsList = colorList.union(strings)
    println(noDupsList)

    val noDupsColor = colorList.distinct()
    println(noDupsColor)

}