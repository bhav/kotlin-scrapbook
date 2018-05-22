package bhav.com.inlinefunctions.dsl

fun main(args: Array<String>) {
    //
    val string = "Hello This is a string"
    println(convert(string))

    println(string.convertAsExtension())

    val sum: Int.(Int) -> String = { otherParam -> (this + 1 + otherParam).toString()  }
    println(sum(5,2))

    val car = makeCar {


        engine("FF") {
            cylinders = 6
            maxRpm = 9000

            cylinders {

            }

            gearSystem {
                this.changeUp()
            }

        }

    }

    val p = person {
        name = "Mommy"
        age = 33
        child {
            name = "Gugu"
            age = 2
        }
        child {
            name = "Gaga"
            age = 3
        }
    }
    println(p)


}


fun makeCar (init: Car.() -> Unit): Car {
    val car = Car("nissan")
    car.init()
    return car
}




data class Person(
        var name: String? = null,
        var age: Int? = null,
        val children: MutableList<Person> = ArrayList()
) {
    fun child(init: Person.() -> Unit) = Person().also {
        it.init()
        children.add(it)
    }
}

//fun person(init: Person.() -> Unit) = Person().apply { init() }

fun person (init: Person.() -> Unit): Person {
    val person = Person()
    person.init()
    return person
}

fun convert(spaced: String): String = spaced.replace(" ", "_")


fun String.convertAsExtension(): String = this.replace(" ", "_")
