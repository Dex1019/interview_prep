package misc

import java.util.*

/**
 * 412. Fizz Buzz
 * https://leetcode.com/problems/fizz-buzz/
 */
fun main(args: Array<String>) {
    val result = fizzBuzz(15)
    for (i in result) {
        println(i)
    }
}

fun fizzBuzz(n: Int): List<String> {
    val result: MutableList<String> = ArrayList()
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            result.add("FizzBuzz")
        } else if (i % 3 == 0) {
            result.add("Fizz")
        } else if (i % 5 == 0) {
            result.add("Buzz")
        } else {
            result.add(Integer.toString(i))
        }
    }
    return result
}