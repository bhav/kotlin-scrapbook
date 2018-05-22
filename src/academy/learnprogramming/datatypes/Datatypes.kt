package academy.learnprogamming.datatypes

import academy.learnprogramming.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
//    val myInt = 10
//    println("default type is int? ${myInt is Int}")
//    var myLong = 22L;
//
//    myLong = myInt.toLong()
//
//    val myByte: Byte = 111
//    var myShort: Short
//
//    myShort = myByte.toShort()
//
//    //kotlin automatically widens literals
//    val anotherInt = 5
//
//    var myDouble = 65.984
//    println(myDouble is Double)
//
//    val myFloat = 10.324324f
//    println("default type is float? ${myFloat is Float}")
//
//    val char = 'b'
//
//    //val myChar:Char = 65 doesn't work in Kotlin, 65 is 'A' .So we have to do this like below:
//    val myChar = 65
//    println(myChar.toChar())
//
//    val myBoolean = true;
//
//    val vacationTime = false;
//    val onVacation = DummyClass().isVacationTime(vacationTime)
//    println(onVacation)
//
//    val anything:Any


    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)

    val longs2 = arrayOf<Long>(1, 2, 3)

    val longs3 = arrayOf(1, 2, 3)

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
//    println(longs3 is Array<Int>)

    println(longs1[2])

    val evenNumbers = Array(16) {i -> i*2}
    for (number in evenNumbers){
//        println(number)
    }

    val lotsOfNumbers = Array(1000000) {i -> i+1}

    val allZeroes = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1,2,3,4)
    for (number in someArray) {
        println(number)
    }

    someArray = Array(6) {i -> (i+1) * 10 }
    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("Hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }
    println("Array has to be of type Any ${mixedArray is Array<Any>}")


    //To call java method with primitive array, you need to call primitive version of kotlin arrays
    val myIntArray = intArrayOf(1,2,3,4,5)

    DummyClass().printNumbers(myIntArray)

    //Cant do this, we cant construct with just size, need both size and initial elements
    //var someOtherArray = Array<Int>(5)

    //This works though
    var someIntArray:Array<Int>

    //However it will work with primitive arrays, with all elements initialised to 0
    var someOtherIntArray = IntArray(5)
    for (number in someOtherIntArray) {
        println(number)
    }

    DummyClass().printNumbers(evenNumbers.toIntArray())
    //DummyClass().printNumbers(evenNumbers.toIntArray())

    val convertedIntArray : Array<Int> = myIntArray.toTypedArray()


}