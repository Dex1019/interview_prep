package twopointers

fun main() {
    val arr = intArrayOf(-1, 4, 2, 1, 3)
    arr.sort()
    val triplets: ArrayList<List<Int>> = ArrayList()
    for (i in arr.indices - 2) {
        findTripletSmallerSum(arr, 5 - arr[i], i, triplets)
    }
    print(triplets)
}

fun findTripletSmallerSum(arr: IntArray, targetSum: Int, start: Int, triplets: ArrayList<List<Int>>) {
    var left = start + 1
    var right = arr.lastIndex

    while (left < right) {
        if (arr[start] + arr[left] + arr[right] < targetSum) {
            for (i in right downTo left) {
                triplets.add(listOf(arr[start], arr[left], arr[i]))
            }
            left++
        } else {
            right--
        }
    }
}


