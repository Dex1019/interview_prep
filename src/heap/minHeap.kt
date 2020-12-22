package heap

import java.util.*

fun main() {

    minHeapUsingPriorityQueue()
}

fun minHeapUsingPriorityQueue() {

    val priorityQueue = PriorityQueue<Int>()
    priorityQueue.add(10)
    priorityQueue.add(30)
    priorityQueue.add(20)
    priorityQueue.add(200)
    priorityQueue.add(2)

//    println("Head value: ${priorityQueue.peek()}") // getting top element using peek()
//    println("Original queue elements")
//    priorityQueue.forEach {
//        println(it)
//    }
//
//    priorityQueue.poll() // removing top element
//    println("Modified queue elements")
//    priorityQueue.forEach {
//        println(it)
//    }

    println(priorityQueue.contains(10))


}