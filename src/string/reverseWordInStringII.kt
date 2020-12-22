package string

/*** Given an input string, reverse the string word by word.
 * Input:
 * ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
 *
 * Output:
 * ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]
 *
 * try to solve in-place
 **/

fun main() {
    val str = arrayOf("t", "h", "e", " ", "s", "k", "y", " ", " ", " ", "i", "s", " ", "b", "l", "u", "e")
    // reverse the whole input
    reverse(str, 0, str.size - 1)
    print(str.contentToString())

    // reverse each individual word
    reverseEachWords(str)
    print("\n ${str.contentToString()}")
}

fun reverse(str: Array<String>, s: Int, e: Int) {
    var start = s
    var end = e
    while (start < end) {
        val temp = str[start]
        str[start] = str[end]
        str[end] = temp
        start++
        end--
    }
}

fun reverseEachWords(str: Array<String>) {
    var start = 0
    var end = 0
    while (start < str.size - 1 && end < str.size - 1) {
        while (start < str.size - 1 && str[start] === " ") {
            start++
        }
        end = start
        while (end < str.size - 1 && str[end] != " ") {
            end++
        }
        reverse(str, start, end - 1)
        start = end
    }
}