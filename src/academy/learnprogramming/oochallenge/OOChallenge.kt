package academy.learnprogramming.oochallenge

import academy.learnprogramming.javacode.MountainBike
import academy.learnprogramming.javacode.RoadBike
import academy.learnprogramming.oochallenge.KotlinBicycle.Companion.availableColors


fun main(args: Array<String>) {

    val kotlinBicycle = KotlinBicycle(2, 14, 3)
    val mountainBike = MountainBike(2, 14, 3, 12)
    val roadBike = RoadBike(2, 12,3, 34)

    kotlinBicycle.printDescription()
    mountainBike.printDescription()
    roadBike.printDescription()

    val kotlinBicycle2 = KotlinBicycle(2, 14)
    val mountainBike2 = KotlinMountainBike(2, 14, 3)
    val roadBike2 = KotlinRoadBike(2, 12, 34)

    kotlinBicycle2.printDescription()
    mountainBike2.printDescription()
    roadBike2.printDescription()

    val mountainBike3 = KotlinMountainBike("Blue", 10, 10,10)
    mountainBike3.printDescription()

    KotlinBicycle.availableColors.forEach {println("Colour is $it")}
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear:Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    open fun printDescription() {
        println("Bike is in gear $gear with cadence $cadence travelling at speed $speed.")
    }

}


class KotlinMountainBike(cadence: Int, speed: Int, var seatHeight: Int, gear:Int=10) : KotlinBicycle(cadence, speed, gear) {

    constructor(colour: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10):this(cadence, speed, seatHeight, gear) {
        println("This colour is $colour")
    }

    override fun printDescription() {
        super.printDescription()
        println("Mountain bike has a seat height of $seatHeight inches")
    }


}

class KotlinRoadBike(cadence: Int, speed: Int, val tireWidth: Int, gear:Int=10) : KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("Road bike has a tire width of $tireWidth inches")
    }

}







