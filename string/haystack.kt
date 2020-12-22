package string

/**
 * 28. Implement strStr()
 * https://leetcode.com/problems/implement-strstr/
 */


fun main(args: Array<String>) {
    val haystack = "mississippi"
    val needle = "issip"
    println(indexOfString(haystack, needle))
}

private fun indexOfString(haystack: String, needle: String): Int {
    var index = 0
    if (needle.isEmpty()) return 0
    for (i in haystack.indices) {
        if (haystack[i] == needle[0]) {
            index = i
            return i
        }
    }
    return -1
}