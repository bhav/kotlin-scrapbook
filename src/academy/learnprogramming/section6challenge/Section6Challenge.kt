package academy.learnprogramming.section6challenge

fun main(args: Array<String>) {

//    for(i in 5..5000 step 5) {
//        println(i)
//    }

//    for (i in -500 .. 0) {
//        println(i)
//    }
//    var lastNum = 0
//    var currentNum = 1
//
//    println(lastNum)
//    println(currentNum)
//    for (i in 1..13) {
//
//        println(lastNum + currentNum)
//        val tmpCurrentNum = currentNum
//        currentNum = lastNum + currentNum;
//        lastNum = tmpCurrentNum
//
//    }

//    iLoop@for (i in 1..5 ) {
//        println(i)
//        if (i == 2) break
//        for (j in 11..20) {
//            println(j)
//            for (k in 100 downTo 90) {
//                println(k)
//                when(k) {
//                    98 -> continue@iLoop
//                }
//            }
//        }
//    }

    val num = 23
    val dnum =  if (num> 100) -234.567 else if (num < 100) 4444.555 else 0.0
    println(dnum)

}