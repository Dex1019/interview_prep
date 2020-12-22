package array

fun main() {
    val arr = intArrayOf(3, 1, 5, 4, 2)
    println(cyclicSort(arr).contentToString())
}

fun cyclicSort(arr: IntArray): IntArray {
    val nums = arr
    var i = 0
    while (i < arr.size) {
        val j = nums[i] - 1
        if (nums[i] != nums[j]) {
            swapNumber(nums, i, j)
        } else {
            i++
        }
    }
    return nums
}

fun swapNumber(arr: IntArray, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}