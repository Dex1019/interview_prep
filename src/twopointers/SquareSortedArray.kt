package twopointers

fun main() {
    val arr = intArrayOf(-2, -1, 0, 2, 3)
    print(squareSortedArray(arr).contentToString())
}

fun squareSortedArray(arr: IntArray): IntArray {
    val squareArray = IntArray(arr.size)
    var highestIndex = arr.lastIndex
    var left = 0
    var right = arr.lastIndex
    while (left <= right) {
        val leftSquare = arr[left] * arr[left]
        val rightSquare = arr[right] * arr[right]
        if (leftSquare > rightSquare) {
            squareArray[highestIndex--] = leftSquare
            left++
        } else {
            squareArray[highestIndex--] = rightSquare
            right--
        }
    }
    return squareArray
}