package array

import kotlin.math.max

/**
 * 152. Maximum Product Subarray
 * https://leetcode.com/problems/maximum-product-subarray/
 */

fun main() {
    val nums = intArrayOf(2, 3, -2, 4)
    print(maxProduct(nums))
}

fun maxProduct(nums: IntArray): Int {
    var sum = Integer.MIN_VALUE
    var prefix = 1
    for (i in nums) {
        prefix *= i
        sum = max(sum, prefix)
        if (prefix == 0) prefix = 1
    }

    var suffix = 1
    for (i in nums.size - 1 downTo 0) {
        suffix *= nums[i]
        sum = max(sum, suffix)
        if (suffix == 0) suffix = 1
    }
    return sum
}