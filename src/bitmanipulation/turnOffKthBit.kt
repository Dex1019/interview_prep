package bitmanipulation

fun main(args: Array<String>) {
    var n = 20
    val k = 3
    println("Binary of 20: " + Integer.toBinaryString(n))
    println("Binary of 3: " + Integer.toBinaryString(k))
    n = turnOffKthBit(n, 3)
    println(n.toString() + " in binary is: " + Integer.toBinaryString(n))
}

fun turnOffKthBit(n: Int, k: Int) = n and (1 shl k - 1).inv()