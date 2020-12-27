package twopointers

fun main() {
    val arr1 = intArrayOf(2, 3, 3, 3, 6, 9, 9)
    print(removeDuplicatesFromSortedArray(arr1))

    val arr2 = intArrayOf(2, 11, 2, 2, 1)
    val key = 2
    print(removeDuplicatesFromUnSortedArray(arr2, key))
}

fun removeDuplicatesFromSortedArray(arr: IntArray): Int {
    var next = 1
    for (start in 1 until arr.size) {
        if (arr[next - 1] != arr[start]) {
            arr[next] = arr[start]
            next++
        }
    }
    return next
}

fun removeDuplicatesFromUnSortedArray(arr: IntArray, key: Int): Int {
    var next = 0
    for (start in arr.indices) {
        if (arr[start] != key) {
            arr[next] = arr[start]
            next++
        }
    }
    return next
}