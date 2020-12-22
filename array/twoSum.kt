package array

fun main(args: Array<String>) {
    println(bruteForceApproach().contentToString())
}

private fun bruteForceApproach(): IntArray {
    val arr = intArrayOf(2, 7, 11, 15)
    val sum = 9
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            if (arr[j] == sum - arr[i]) {  // 9 -2 =7
                return intArrayOf(i, j)
            }
        }
    }
    throw IllegalArgumentException("No two sum solution")
}