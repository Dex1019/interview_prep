package heap

import java.util.*
import kotlin.collections.HashMap

/**
 * 347. Top K Frequent Elements
 * https://leetcode.com/problems/top-k-frequent-elements/
 * Time complexity: O(NlogK) where n is elements in array and k is frequent element count
 * Space complexity: O(N+K)
 */

fun main() {
    val nums = intArrayOf(1, 1, 1, 2, 2, 3)
    val k = 2

    print(findTopKFrequentElement(nums, k).contentToString())
}

fun findTopKFrequentElement(nums: IntArray, k: Int): IntArray {
    if (k == nums.size) return nums

    val count = HashMap<Int, Int>()
    for (i in nums) {
        count[i] = count.getOrDefault(i, 0) + 1
    }

    val heap = PriorityQueue<Int> { a, b -> nums[b] - nums[a] }

    for (i in count.keys) {
        heap.add(i)
        if (heap.size > k) {
            heap.poll()
        }
    }

    val top = IntArray(k)
    for (i in k - 1 downTo 0) {
        top[i] = heap.poll()
    }

    return top
}