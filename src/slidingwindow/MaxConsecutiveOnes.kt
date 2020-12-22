package slidingwindow

/**
 * 485. Max Consecutive Ones
 * https://leetcode.com/problems/max-consecutive-ones/
 */

fun main() {
    var arr = intArrayOf(0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1)
    var k = 3
    print(longestOnes(arr, k))
}

fun longestOnes(A: IntArray, K: Int): Int {
    val map = HashMap<Int, Int>()
    var start = 0
    var result = 0
    var maxCount = 0


    for (end in A.indices) {
        val n = A[end]
        map[n] = map.getOrDefault(n, 0) + 1
        maxCount = maxOf(maxCount, map.getValue(n))
        while (end - start + 1 - maxCount > K) {
            val num = A[start]
            map[num] = map.getValue(num) - 1
            start++
        }

        result = if (map.containsKey(1)) {
            maxOf(result, end - start + 1)
        } else {
            0
        }

    }
    return result
}