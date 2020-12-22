package slidingwindow

/**
 * 209. Minimum Size Subarray Sum
 * https://leetcode.com/problems/minimum-size-subarray-sum/
 */

fun main() {
    val arr = intArrayOf(2, 1, 5, 2, 3, 2)
    val n = 7
    print(findMinSubArray(n, arr))
}

fun findMinSubArray(n: Int, arr: IntArray): Int {
    var start = 0
    var windowSum = 0
    var minLength = Int.MAX_VALUE

    for (end in arr.indices) {
        windowSum += arr[end]
        while (windowSum >= n) {
            minLength = Math.min(minLength, end - start + 1)
            windowSum -= arr[start]
            start++
        }
    }
    return if (minLength == Int.MAX_VALUE) 0 else minLength
}