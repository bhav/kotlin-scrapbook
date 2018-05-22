package bhav.com.inlinefunctions

fun main(args: Array<String>) {

resultPrinter { x, y ->
    "The result is ${x + y}"
}

}


inline fun resultPrinter(f: (Int, Int) -> String) {
val x = f(5,6)
    println(x)
}