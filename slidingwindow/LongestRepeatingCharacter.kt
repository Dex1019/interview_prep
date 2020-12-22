package slidingwindow

/**
 * 424. Longest Repeating Character Replacement
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 */

fun main() {
    val s = "ABAB"
    val k = 2
    print(findLongestRepeating(s, k))
}

fun findLongestRepeating(s: String, k: Int): Int {
    val arr = IntArray(26)
    var start = 0
    var result = 0
    var maxCount = 0


    for (end in s.indices) {
        var ch = s[end]
        arr[ch - 'A']++
        maxCount = maxOf(maxCount, arr[ch - 'A'])
        while (end - start + 1 - maxCount > k) {
            var c = s[start]
            arr[c - 'A']--
            start++
        }
        result = maxOf(result, end - start + 1)
    }
    return result
}