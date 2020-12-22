package string

/**
 * A pangram is a sentence which contains all alphabet from a-z
 */

fun main() {

    val str = "The quick brown fox jumps over the lazy dog"
    print(checkPangram(str))
}

fun checkPangram(str: String): Boolean {
    var index = 0
    val arr = BooleanArray(26)

    for (i in str.indices) {
        if (str[i] in 'a'..'z') {
            index = str[i] - 'a'
        } else if (str[i] in 'A'..'Z') {
            index = str[i] - 'A'
        }
        arr[index] = true
    }

    for (i in arr.indices) {
        if (!arr[i]) {
            return false
        }
    }

    return true
}