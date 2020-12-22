package bitmanipulation

fun main(args: Array<String>) {
    val num = 5
    val mask = Integer.highestOneBit(num shl 1) - 1
    val result = num.inv()
    println(Integer.toBinaryString(result and mask))
}