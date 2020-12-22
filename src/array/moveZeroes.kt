package array

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */

fun main(args: Array<String>) {
    val arr = intArrayOf(0, 1, 0, 3, 12)
    moveZeroes(arr)
    println(arr.contentToString())
}

fun moveZeroes(arr: IntArray) {
    var pos = 0
    for (i in arr.indices) {
        if (arr[i] != 0) {
            arr[pos++] = arr[i]
        }
    }
    for (j in pos until arr.size) {
        arr[j] = 0
    }
}