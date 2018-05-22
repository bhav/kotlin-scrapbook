package academy.learnprogramming.challenge2

import academy.learnprogramming.javacode.Dummy

fun main(args: Array<String>) {

    //1
    val float1 = -3847.384f
    println(float1 is Float)
    val float2: Float = -3847.384f
    val float3  = -3847.384.toFloat()

    //2 - Nullable versions

    val float1n : Float? = -3847.384f
    val float3n : Float? = -3847.384.toFloat()

    //3
    val shortArray = arrayOf<Short>(1,2,3,4,5)

    val shortArray2 = shortArrayOf(1,2,3,4,5)

    val shortArray3: Array<Short> = arrayOf(1,2,3,4,5)

    //4
    var nullableIntArray = Array<Int?>(40) {i -> (i+1)*5}

    //5

    val charArray = charArrayOf('a', 'b', 'c')
    Dummy().method1(charArray)


    //6
    val x:String? = "I AM IN UPPERCASE"
    //val x:String? = null

    val result:String = x?.toLowerCase() ?: "I give up"
    println(result)

    //7
    x?.let { println(it.toLowerCase().replace("am", "am not") ) }

    //8
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}