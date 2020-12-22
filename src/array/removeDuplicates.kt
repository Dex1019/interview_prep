package array

/**
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

fun main(args: Array<String>) {
    val num = intArrayOf(1, 1, 1, 2, 2, 4, 6, 7)
    println(removeDuplicates(num))
}

fun removeDuplicates(num: IntArray): Int {
    if (num.isEmpty()) return 0
    var i = 0
    for (j in 1 until num.size) {
        if (num[j] != num[i]) {
            i++
            num[i] = num[j]
        }
    }
    return i + 1
}