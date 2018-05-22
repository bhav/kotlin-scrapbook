package adademy.learnprogramming.functions

import java.math.BigDecimal

fun main(args: Array<String>) {


    val tariffName = "Farley"
    val tariffs = mapOf<String, (Long) -> BigDecimal>( "Farley" to FarleyCentreTariff().tariffSchemeCalculator)

    if (tariffName == "Farley") {
        val scheme = tariffs.get(tariffName)
        val price = scheme!!.invoke(1000)
        println(price)
    }


    val someString:String? = null

    val result = someString?.let { someString } ?: "nah boss"

    println(result)

}


class FarleyCentreTariff {


    val tariffSchemeCalculator: (Long) -> BigDecimal = {
        sessionLength ->


            if (sessionLength < 60L) {
                BigDecimal(40L)
            } else if (sessionLength < 120L) {
                BigDecimal(80L)
            } else if (sessionLength < 180L) {
                BigDecimal(120L)
            } else if (sessionLength < 240L) {
                BigDecimal(160L)
            } else if (sessionLength < 300L) {
                BigDecimal(300L)
            } else if (sessionLength < 720L) {
                BigDecimal(300L)
            } else {
                BigDecimal(600L)
            }



    }

}