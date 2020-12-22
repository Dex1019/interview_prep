package array

fun main(args: Array<String>) {
    val arr = intArrayOf(2, 5, 1, 3, 4, 7)
    println(shuffle(arr, 3).contentToString())
}

fun shuffle(nums: IntArray, n: Int): IntArray {
    val result = IntArray(nums.size)
    var i = 0
    while (i < result.size) {
        result[i] = nums[i / 2]
        result[i + 1] = nums[i / 2 + n]
        i += 2
    }
    return result
}