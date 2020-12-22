package twopointers

fun main() {
    val arr = intArrayOf(-3, 0, 1, 2, -1, 1, -2)
    arr.sort()
    val triplets: ArrayList<List<Int>> = ArrayList()
    for (i in 0 until arr.size - 2) {
        if (i > 0 && arr[i] == arr[i - 1]) continue
        findTripletSumZero(arr, -arr[i], i + 1, triplets)
    }
    print(triplets)
}

fun findTripletSumZero(arr: IntArray, targetSum: Int, start: Int, triplets: ArrayList<List<Int>>) {
    var right = arr.lastIndex - 1
    var left = start
    while (left < right) {
        val currentSum = arr[left] + arr[right]
        when {
            currentSum == targetSum -> { // we found our triplet
                triplets.add(listOf(-targetSum, arr[left], arr[right]))
                left++
                right--
                while (left < right && arr[left] == arr[left - 1]) { // we found duplicate
                    left++
                }
                while (left < right && arr[right] == arr[right + 1]) {
                    right--
                }
            }
            targetSum > currentSum -> left++
            else -> right--
        }
    }
}


