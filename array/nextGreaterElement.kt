package array

import java.util.*

fun main() {
    val num = 12
    print(findNextNumber(num))
}

fun findNextNumber(n: Int): Int {
    val result = -1
    val cs = n.toString().toCharArray()
    val len = cs.size
    if (len <= 1) return result

    var j = len - 1
    var found = false


    while (j >= 1) {
        if (cs[j] <= cs[j - 1]) {
            j--
        } else {
            var pos = j
            while (pos < len && cs[pos] > cs[j - 1]) pos++
            pos--

            val temp = cs[pos]
            cs[pos] = cs[j - 1]
            cs[j - 1] = temp

            Arrays.sort(cs, j, len)
            found = true
            break
        }
    }
    if (j == 0 && !found) return result
    val l = String(cs).toLong()
    return if (l > Int.MAX_VALUE) result else l.toInt()
}