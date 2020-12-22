package slidingwindow

/**
 * 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */

fun main() {
    val s = "pwwkew"
    print(findLongestSubstring(s))
}

fun findLongestSubstring(s: String): Int {
    val map = HashMap<Char, Int>()
    var start = 0
    var result = 0

    for (end in s.indices) {
        val ch = s[end]
        map[ch] = map.getOrDefault(ch, 0) + 1
        val value = map[ch]!!

        while (map.containsKey(ch) && value > 1) {
            val c = s[start]
            map[c] = map[c]!!.minus(1)
            if (map[c] == 0) {
                map.remove(c)
            }
            start++
        }
        result = Math.max(result, end - start + 1)
    }
    return result
}