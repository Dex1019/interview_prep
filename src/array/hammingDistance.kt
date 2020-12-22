package array


fun main(args: Array<String>) {
    val n1 = 9
    val n2 = 14
    println(hammingDistance(n1, n2))
}

fun hammingDistance(n1: Int, n2: Int): Int {
    var x: Int = n1 xor n2
    var setBits = 0
    while (x > 0) {
        setBits += x and 1
        x = x shr 1
    }
    return setBits
}