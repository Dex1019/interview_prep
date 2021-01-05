package array

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    print(productExceptSelf(nums).contentToString())
}

fun productExceptSelf(nums: IntArray): IntArray {
    var result = IntArray(nums.size)
    var product = 1

    for (i in nums.indices) {
        result[i] = product
        product *= nums[i]
    }
    product = 1

    for (i in nums.size - 1 downTo 0) {
        result[i] *= product
        product *= nums[i]
    }

    return result
}