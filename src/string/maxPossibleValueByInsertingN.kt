package string

fun main() {


    generateMaxPossibleValue(-1234)
}

fun generateMaxPossibleValue(num: Int): Int {

    var numString = num.toString()
    var result = ""

    // handle negative numbers
    if (num < 0) {

        numString = numString.substring(1)
        for (i in numString.indices) {
            result = "-" + numString.substring(0, i) + "5" + numString

        }
    }






    return 0
}