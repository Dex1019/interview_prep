package slidingwindow

/**
 *
 */

fun main() {
    val str = "araaci"
    val k = 1
    print(findLength(k, str))
}

fun findLength(k: Int, s: String): Int {
    var start = 0
    var maxLength = 0
    var map = HashMap<Char, Int>()

    for (end in s.indices) {
        val ch = s[end]
        map[ch] = map.getOrDefault(ch, 0) + 1
        while (map.size > k) {
            val c = s[start]
            map[c] = map[c]!!.minus(1)
            if (map[c] == 0) {
                map.remove(c)
            }
            start++
        }
        maxLength = Math.max(maxLength, end - start + 1)
    }
    return maxLength
}