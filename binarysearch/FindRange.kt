package binarysearch

/**
 * Time complexity: O(logn)
 * Space complexity: 0(1)
 */

fun main() {
    val arr = arrayListOf(1, 2, 3, 3, 3, 4, 5, 5)
    println(arr.findIndices(3))
}

private fun ArrayList<Int>.firstPosition(value: Int): Int? {
    val n = this.size
    var firstPosition: Int? = null
    var low = 0
    var high = n - 1

    while (low <= high) {
        val mid: Int = (low + high) / 2
        if (this[mid] >= value) {
            firstPosition = mid
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return firstPosition
}

private fun ArrayList<Int>.findIndices(value: Int): IntRange? {
    val startIndex = firstPosition(value) ?: return null
    val endIndex = firstPosition(value + 1) ?: return null
    return startIndex until endIndex
}

