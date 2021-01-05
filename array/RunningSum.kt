package array

/**
 * 1480. Running Sum of 1d Array
 * https://leetcode.com/problems/running-sum-of-1d-array/
 */
fun main(args: Array<String>) {
    val nums = intArrayOf(1, 2, 3, 4)
    println(runningSumArray(nums).contentToString())
}

private fun runningSumArray(nums: IntArray): IntArray {
    val sum = IntArray(nums.size)
    var ans = 0
    for (i in sum.indices) {
        ans += nums[i]
        sum[i] = ans
    }
    return sum
}