package academy.learnprogramming.sequences

//Sequences are performance enhancers and useful for when you are dealing with long collections and potentially many functions/filtering/mapping on those functions as it analyses each item in the collection all the way through the chain. rather than creating new lists at each step of filtering or mapping. Can only get something concrete though when we use a terminal function with sequences.
fun main(args: Array<String>) {

    val immutableMap = mapOf<Int, Car>(1 to Car("green", "toyota", 2015),
            2 to Car("red", "ford", 2016),
            3 to Car("silver", "honda", 2013),
            17 to Car("red", "bmw", 2015),
            8 to Car("green", "ford", 2010))

    println(immutableMap.asSequence().filter {it.value.model == "Ford"}.map{it.value.color} )

    listOf("joe", "mary", "jane").asSequence()
            .filter{ println("filtering $it"); it[0] =='j' }
            .map { println("Mapping $it"); it.toUpperCase() }
            .toList() //will only print with a terminal operator i.e. toList

    println("-----")
    listOf("joe", "mary", "jane").asSequence()
            .filter{ println("filtering $it"); it[0] =='j' }
            .map { println("Mapping $it"); it.toUpperCase() }
            .find{ it.endsWith('E')} //will only print with a terminal operator i.e. toList, or find.

}

data class Car(val color: String, val model:String, val year:Int)