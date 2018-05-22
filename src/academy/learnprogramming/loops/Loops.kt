package academy.learnprogramming.loops

fun main(args: Array<String>) {

//    val range = 1..5
//
//    val charRange = 'a'..'z'
//    val stringRange = "ABC".."XYZ"
//
//    println(3 in range)
//    println('q' in charRange)
//    println("CCC" in stringRange)
//    println("CCCCCC" in stringRange)
//    println("ZZZZZZ" in stringRange)
//
//    val backwardRange = 5.downTo(1)
//    println(5 in backwardRange)
//
//    val stepRange = 3..15
//    val stepThree = stepRange.step(3)
//
//    for (n in stepThree) {
//        println(n)
//    }
//
//    for (i in 20 downTo 5 step 5 ) {
//        println(i)
//    }

//    val seasons = arrayOf("spring", "summer", "autumn", "winter")
//    for (season in seasons) {
//        println(season)
//    }
//
//    for (index in seasons.indices) {
//        println("${seasons[index]} is season number $index")
//    }
//
//    val notASeason = "whatever" !in seasons
//    println(notASeason)


    //can give for loops names!

    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k ==7) {
                    break@jloop;  //can use continue to complete j looping
                }
            }
        }
    }
}