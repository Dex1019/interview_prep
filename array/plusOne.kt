package array

/**
 * Given a non-empty array of digits representing a non-negative integer, increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * Example 1:
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */

fun main(args: Array<String>) {
    val arr = intArrayOf(8, 9, 9, 9)
    println(plusOne(arr).contentToString())
}

fun plusOne(arr: IntArray): IntArray {
    for (i in arr.indices.reversed()) {
        if (arr[i] != 9) {
            arr[i]++
            return arr
        } else {
            arr[i] = 0
        }
    }
    val result = IntArray(arr.size + 1)
    result[0] = 1
    return result
}