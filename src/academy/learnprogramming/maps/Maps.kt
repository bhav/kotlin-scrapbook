package academy.learnprogramming.maps

fun main(args: Array<String>) {

    val setInts = setOf(10, 15,19,5, 3,-22)
    println(setInts.plus(20))
    println(setInts.plus(10))
    println(setInts.minus(19))
    println(setInts.minus(100))
    println(setInts.average())
    println(setInts.drop(3))


    val mutableInts = mutableSetOf(1,2,3,4,5)
    mutableInts.plus(10)
    println(mutableInts)



    val immutableMap = mapOf<Int, Car>(1 to Car("green", "toyota", 2015),
            2 to Car("red", "ford", 2015),
    3 to Car("silver", "honda", 2015))

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = hashMapOf<String, Car>("Johns Car" to Car("red", "Range Rover", 2010),
            "Janes Car" to Car("blue", "Hyundai", 2012))

    println(mutableMap.javaClass)
    mutableMap.put("Marys car", Car("red", "corvette", 1965))



    val pair = Pair(10, "ten")
    //val first = pair.first
    //val second = pair.second

    //can also use Destructured references i.e. below

    val (firstValue, secondValue) = pair

    println(firstValue)
    println(secondValue)

    for ((k,v) in mutableMap) {
        println(k)
        println(v)
    }

    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car
    println("color= $color, model= $model, year= $year")
}

class Car(val color: String, val model:String, val year:Int) {

    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year

//If we make this a dataclass we get destructuring for free. Try it. Obviously we don't need the component functions then.
}