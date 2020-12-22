package queue

import java.util.*

fun main() {

    val nums = PriorityQueue<Int>()
    nums.add(800)
    nums.add(50)
    nums.add(200)
    nums.add(550)

    println("peek: ${nums.peek()}")
    nums.forEach {
        println(it)
    }
}