package string

fun main() {
    print(toLowerCase("fUcK"))


    val num = IntArray(26)
    val s = "anagram"
    val t = "nagaram"
}


fun toLowerCase(str: String): String {
    val sb = StringBuilder()
    for (i in str) {
        if (i in 'A'..'Z') sb.append(i + 32) else sb.append(i)
    }
    return sb.toString()
}