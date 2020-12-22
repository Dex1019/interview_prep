package bitmanipulation

fun main(args: Array<String>) {
    val input = -2
    println(input.toString() + " is " + checkEvenOdd(input))
}

private fun checkEvenOdd(input: Int): String = if (input and 1 == 1) "odd" else "even"
