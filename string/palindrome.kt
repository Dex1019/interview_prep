package string

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 *
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 *
 * Example 2:
 * Input: "race a car"
 * Output: false
 */

fun main(args: Array<String>) {
    val str = "A man, a plan, a canal: Panama"
    println(isPalindrome(str))
}

private fun isPalindrome(s: String): Boolean {
    val str = s.toLowerCase()
    var start = 0
    var end = str.length - 1
    while (start < end) {
        val l = str[start]
        val r = str[end]
        if (l !in 'a'..'z' && !Character.isDigit(l)) { // a = 97 , z = 122  A = 65, Z = 90
            start++
        } else if (r !in 'a'..'z' && !Character.isDigit(r)) {
            end--
        } else if (l == r) {
            start++
            end--
        } else {
            return false
        }
    }
    return true
}
