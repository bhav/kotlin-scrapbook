package bhav.com.inlinefunctions.dsl

class EngineBehaviour(val maxGears:Int, val maxSpeed:Int) {

    var cylinders: Int = 0
    var maxRpm: Int = 1000


    fun cylinders(init: Cylinders.() -> Unit): Cylinders {
        val cylinders = Cylinders()
        cylinders.init()
        return cylinders

    }

    fun gearSystem(init: GearSystem.() -> Unit): GearSystem {
        val gearSystem = GearSystem()
        gearSystem.init()
        return gearSystem

    }

}


class Cylinders() {

    val depth: Int = 100
    val fuelType: String = "Petrol"

}

class GearSystem() {

    val dualClutch: Boolean = true

    fun changeUp() = {
        Thread.sleep(10000)
        println("Changing gears up!")
    }

}