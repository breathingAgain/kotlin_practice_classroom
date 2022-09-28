fun main(args: Array<String>) {
    val numbers = listOf(1, 55, 25, 32, 2, 67, 31, 33, 11, 25, 66, 81, 97, 43, 46, 81)
    sol1(numbers)
    println("\n")
    sol2(numbers)
    println("\n")
    sol3(numbers)

}
fun sol1(numbers: List<Int>){
    for(item: Int in numbers){
        if(item % 2 == 1)
            print("$item ")
    }
}

fun sol2(numbers: List<Int>){
    for(item: Int in numbers){
        if(item % 3 != 0)
            print("$item ")
    }
}

fun sol3(numbers: List<Int>){
    for(i in numbers.indices){
        if(numbers[i] % (i+1) == 0)
            print("${numbers[i]} ")
    }
}