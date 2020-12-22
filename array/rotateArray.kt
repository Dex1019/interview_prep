package array

fun main(args: Array<String>) {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val k = 2
    println("Original array:")
    printArray(arr)

    println("Array rotate right:")
    rotateRightUsingReverse(arr, 0, arr.size - 1)
    rotateRightUsingReverse(arr, 0, k - 1)
    rotateRightUsingReverse(arr, k, arr.size - 1)
    printArray(arr)

    val arr1 = intArrayOf(1, 2, 3, 4, 5)
    println("Array rotate left:")
    rotateLeftUsingReverse(arr1, 0, k - 1)
    rotateLeftUsingReverse(arr1, k, arr1.size - 1)
    rotateLeftUsingReverse(arr1, 0, arr1.size - 1)
    printArray(arr1)
}

private fun rotateLeftUsingReverse(arr: IntArray, start: Int, end: Int) {
    var start = start
    var end = end
    while (start < end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }
}

private fun rotateRightUsingReverse(arr: IntArray, start: Int, end: Int) {
    var start = start
    var end = end
    while (start < end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }
}

private fun rotateRightUsingShift(arr: IntArray, k: Int): IntArray { // O(n^2) solution
    for (j in 0 until k) {
        val last = arr[arr.size - 1]
        for (i in arr.size - 1 downTo 1) {
            arr[i] = arr[i - 1]
        }
        arr[0] = last
    }
    return arr
}

private fun printArray(arr: IntArray) = println(arr.contentToString())