package string


fun main(args: Array<String>) {
    val n = 2147447412
    println(reverseInteger(n))
}

fun reverseInteger(n: Int): Int {
    var num = n
    var result = 0
    while (num != 0) {
        val digit = num % 10
        if (result > Int.MAX_VALUE / 10) return 0
        if (result < Int.MIN_VALUE / 10) return 0
        result = result * 10 + digit
        num /= 10
    }
    return result
}