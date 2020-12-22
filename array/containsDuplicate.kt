package array

import java.util.*

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 * Example 2:
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3)
    println(checkDuplicate(arr))
}

private fun checkDuplicate(arr: IntArray): Boolean {
    val map = HashMap<Int, Int>()
    for (i in arr.indices) {
        map[arr[i]] = map.getOrDefault(arr[i], 0) + 1
    }
    for (i in arr.indices) {
        if (map[arr[i]]!! > 1) {
            return true
        }
    }
    return false
}