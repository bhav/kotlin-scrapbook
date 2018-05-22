package academy.learnprogramming.nullreferences

import java.awt.SystemColor.text

fun main(args: Array<String>) {

    val str: String? = null;
    println(str?.toUpperCase())

    //Can check nulls in one line.
    //val countryCode: String? = bankBranch?.address?.country?.countryCode

    val str2 = str ?: "This is the defaultValue"

    println(str2)

    val something:Any = arrayOf(1,2,3,4)
    val str3 = something as? String
    println(str3)

    val string1: String? = null
   // val string4 = string1!!.toUpperCase() //!! means we are telling the compiler we are definitely sure that string1 is 100% not null. Useful if your app depends on throwing a NPE

    val st: String? = "NotNull"

    //printText(st)
    st?.let { printText(it) }

    val st4 : String? = null
    val anotherString = "This isnt nullable"

    println(st4 == anotherString)

    val st2 = st!!
    val st3 = st2.toUpperCase()

    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }

    println(nullableInts[3].toString())


}

fun printText(text: String) {
    println(text)
}