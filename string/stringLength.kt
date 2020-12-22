package string

fun main(args: Array<String>) {
    val str = "Hello world"
    var length = 0
    for (c in str.toCharArray()) {
        println("Character: $c")
        length++
    }
    println("Total length: $length")
}