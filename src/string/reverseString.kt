package string


fun main(args: Array<String>) {
    val str = "Hello"
    val ch = str.toCharArray()
    println(reverseString(ch))
}

fun reverseString(ch: CharArray): CharArray {
    var left = 0
    var right: Int = ch.size - 1
    while (left < right) {
        val temp: Char = ch[left]
        ch[left++] = ch[right]
        ch[right--] = temp
    }
    return ch
}