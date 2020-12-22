package array

fun main() {
    val nums = intArrayOf(1, 3, -1, -3, 5, 3, 6, 7)
    val k = 3
//    maxSlidingWindow(nums, k)
//    for (i in nums){
//        nums[i]
//    }

    for (i in 1 until nums.size) {
        println(nums[i])
    }
}

fun maxSlidingWindow(nums: IntArray, k: Int) {
    val list = intArrayOf()
    var start = 0
    var sum = 0
    for (i in nums.indices) {
        sum += nums[start]

        if (i >= k - 1) {
        }
    }

}