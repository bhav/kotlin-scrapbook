package academy.learnprogramming.contravariance

//Contravariance is the opposite if Covariance. Contravariance is when a class allows generic supertypes to be included in the function calls.
// The keyword this time is 'In' and as expected you can have write methods, but not read methods, because the return type is not guaranteed.
fun main(args: Array<String>) {

    val carCare = object: VehicleCare<Car> {
        override fun washVehicle(vehicle: Car) {
            println("Washing Car")
        }

    }
    val carGarage: Garage<Car> = Garage(listOf(Car(), Car()), carCare)
    carGarage.performCare()

    val truckCare = object: VehicleCare<Truck> {
        override fun washVehicle(vehicle: Truck) {
            println("Washing Truck")
        }

    }
    val truckGarage: Garage<Truck> = Garage(listOf(Truck()), truckCare)
    truckGarage.performCare()

    //Now if we had many kinds of vehicles, and all of them we're just washed the same way it would get tedious to write many different care implementations.
    //Let's write a generic Vehicle Care that can be used by all..

    val vehicleCare = object: VehicleCare<Vehicle> {
        override fun washVehicle(vehicle: Vehicle) {
            println("Washing new way ${vehicle.type}")
        }

    }

    //Without the in keyword applied to the care, to allow for the care class to be 'Contravariant', the following declarations of garage would error.
    val carGarage2: Garage<Car> = Garage(listOf(Car(), Car()), vehicleCare)
    carGarage2.performCare()

    val truckGarage2: Garage<Truck> = Garage(listOf(Truck(), Truck()), vehicleCare)
    truckGarage2.performCare()


}




open class Vehicle (val type: String) {


}

class Car: Vehicle("car") {

}

class Truck: Vehicle("truck") {

}


class Garage<T>(val vehicles: List<T>, val vehicleCare: VehicleCare<T>) {

    fun getFirstVehicle(): T {
        return vehicles.first()
    }

    fun performCare() {
        vehicleCare.washVehicle(vehicles.first())
    }
}


interface VehicleCare<in T> {
    fun washVehicle(vehicle: T)

    //as with covariance not allowing 'in/write' methods, contravariance does not allow out/read methods as commented out below'

    //fun getWashedVehicle(): T
}