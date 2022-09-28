import java.lang.Math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    data class Rectangle(val height: Int, val width: Int) {
        val perimeter: Int
            get() = height * 2 + width * 2
        val area: Int
            get() = height * width
    }

    val rectangles = listOf(
        Rectangle(12, 1),
        Rectangle(4, 6),
        Rectangle(5, 15),
        Rectangle(7, 32),
        Rectangle(45, 32),
        Rectangle(10, 12),
        Rectangle(3, 9),
    )

    for(i  in rectangles){
        print("${i.perimeter} ")
    }
    println()

    for(i in rectangles){
        print("${i.area} ")
    }

    println()

    for(i in rectangles){
        val a: Int = i.perimeter / 2
        print("$a ")
    }
    println()

    for (i in rectangles){
        val a: Double = i.height.toDouble()
        val b: Double = i.width.toDouble()
        val c: Double = sqrt(pow(a, 2.0) + pow(b, 2.0))
        print("$c ")
    }
}

