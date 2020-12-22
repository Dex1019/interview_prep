package string

fun main() {
    val num = -622
    maxPossibleValue(num)
}

fun maxPossibleValue(num: Int) {
    var numString = num.toString()
    var result: String? = null

    // Negative number
    if (num < 0) {
        numString = numString.substring(1)
        for (i in numString.indices) {
            if (numString[i] - '0' > 5) {
                result = "-" + numString.substring(0, i) + "5" + numString.substring(i)
                break
            }
            if (result == null) {
                result = "-" + numString + "5"
            }
        }
        println(result)
        return
    }

    for (i in numString.indices) {
        if (numString[i] - '0' < 5) {
            result = numString.substring(0, i) + "5" + numString.substring(i)
            break
        }
    }

    println(result)
}