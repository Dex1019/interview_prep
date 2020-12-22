package array

fun main(args: Array<String>) {
    val nums = intArrayOf(1, 2, 3, 4)
    println(runningSumArray(nums).contentToString())
}

private fun runningSumArray(nums: IntArray): IntArray {
    val sum = IntArray(nums.size)
    var ans = 0
    for (i in sum.indices) {
        ans += nums[i]
        sum[i] = ans
    }
    return sum
}