import java.lang.Math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    val strings = listOf(
        "Apple",
        "Orange",
        "Peach",
        "Banana",
        "Tangerine",
        "Grapefruit",
        "Kiwi",
    )

    sol1(strings)
    println()
    sol2(strings)
}

fun sol1(strings: List<String>){
    for (i in strings){
        if (i.get(0).isUpperCase())
            println ("Yes for $i")
    }
}

fun sol2(strings: List<String>){
    for (i in strings){
        if (i.length == 5)
            println ("Yes string $i has length 5")
    }
}

