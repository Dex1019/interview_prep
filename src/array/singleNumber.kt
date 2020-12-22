package array

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 */
fun main(args: Array<String>) {
    val arr = intArrayOf(2, 2, 1)
    println(singleNumber(arr))
}

fun singleNumber(arr: IntArray): Int {
    var result = 0
    for (i in arr.indices) {
        result = result xor arr[i]
    }
    return result
}