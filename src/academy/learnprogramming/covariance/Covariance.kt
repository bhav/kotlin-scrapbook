package academy.learnprogramming.covariance

//Covariance is when you want to allow a generic type function to accept a subtype of that function. The only downside is that now, this function can only be 'out' functioning, not in functioning. So have only read members, not write or mutable members
//That's why immutableList is covariant, but mutable list isnt
fun main(args: Array<String>) {

    val shorts: MutableList<Short> = mutableListOf(1,2,3,4,5)
    //convertToInt(shorts) Immutable list is covariant, so subtype List<Short> would work when calling convertToInt. Mutable list is not covariant, so it wouldn't work.





}



fun driveIntoCarGarage(garage: Garage<Car>) {
    val listOfCars = listOf(Car())
    parkCar(garage, listOfCars) // the park Car function explicity only takes Garage<Vehicles> it is invariant. To make it covariant, we need to explicity add the 'out' keyword
}

fun parkCar(garage: Garage<Vehicle>, vehicles: List<Vehicle>) {
    val garageOfVehicles = Garage<Vehicle>(vehicles)
}


open class Vehicle {


}

class Car: Vehicle() {

}

//Note this is declaration site variance. On a class level. Java can't do this i.e. List<? extends XXX>() (covariance) or List<? super XXX> (contravariance)
//Use site variance is when you have in or out in function parameter calls. Java does this however!
class Garage<out T>(val vehicles: List<T>) {



    fun getFirstVehicle(): T {
        return vehicles.first()
    }

//When we have set the keyword out, we cannot then have any 'in' type functions that allow a different type of T to be introduced.
//    fun doSomethingINwithT(vehicles: List<T>) {
//
//    }



}






fun convertToInt(collection:MutableList<Number>) {
    for (num in collection) {
        println(num.toInt())
    }
}