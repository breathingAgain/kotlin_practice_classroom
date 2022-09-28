fun main(args: Array<String>) {
    val numbers = listOf(1, 55, 25, 32, 2, 67, 31, 33, 11, 25, 66, 81, 97, 43, 46, 81)
    sol1(numbers)
    println("\n")
    sol2(numbers)
}
fun sol1(numbers: List<Int>){
    numbers.forEach{
        if (it % 2 == 1)
            print("$it ")
    }
}
fun sol2(numbers: List<Int>){
    numbers.forEach{
        if (it % 3 != 0)
            print("$it ")
    }
}

