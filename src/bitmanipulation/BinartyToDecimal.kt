package bitmanipulation

import kotlin.math.pow

fun main() {
    var num = 101
    var decimal = 0
    var rem: Int
    var i = 0

    while (num != 0) {
        rem = num % 10
        num /= 10
        decimal += (rem * 2.0.pow(i.toDouble())).toInt()
        ++i
    }
    println(decimal)
}
