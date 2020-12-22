package array


fun main() {
    val arr = intArrayOf(1, 2, 3, 4)
    val k = 4

    rotateArray(arr, 0, arr.size - 1)
    println(arr.contentToString())
    rotateArray(arr, 0, k - 1)
    println(arr.contentToString())
    rotateArray(arr, k, arr.size - 1)
    println(arr.contentToString())
}

fun rotateArray(arr: IntArray, start: Int, end: Int) {
    var start_ = start
    var end_ = end
    while (start_ < end_) {
        val temp = arr[start_]
        arr[start_] = arr[end_]
        arr[end_] = temp
        start_++
        end_--
    }
}
