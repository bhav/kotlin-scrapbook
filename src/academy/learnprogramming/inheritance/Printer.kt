package academy.learnprogramming.inheritance


fun main(args: Array<String>) {

    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()

    SomethingElse("Whatever")
}


abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {

    //override is open by default, but if you want to not allow subclasses to override it, use final!
    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99


}

class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {


}

open class Something: MySubInterface {
    override val number: Int = 25


    override fun MyFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun MySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val someProperty: String
    constructor(someParam: String) {
        someProperty = someParam
        println("Im in the parents constructor")
    }
}

class SomethingElse: Something {

    //can only call super class secondary constructor IF no primarary construcrotsr are involved
    constructor(someOtherPAram: String): super(someOtherPAram) {
        println("Im in the childs constructor")
    }

}



interface MyInterface {
    val number: Int
    val number2: Int
        get() = number * 100
    fun MyFunction(str: String) : String

}

interface MySubInterface: MyInterface {
    fun MySubFunction(num: Int) : String
}