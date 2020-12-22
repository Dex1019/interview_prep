package bitmanipulation

fun main(args: Array<String>) {
    val x = 10
    val y = 20
    swapNumbers(x, y)
}

fun swapNumbers(inputX: Int, inputY: Int) {
    var x: Int = inputX
    var y: Int = inputY
    x = x xor y
    y = x xor y
    x = x xor y
    println("x : $x")
    println("y : $y")
}