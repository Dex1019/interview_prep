package string

/**
 * ASCII values  of alphabets:
 * A – Z = 65 to 90,
 * a – z = 97 to 122
 */

fun main(args: Array<String>) {
    val str1 = "heLLo woRLd &&&&"
    println("UpperCase: " + implementToUpperCase(str1))
    println("LowerCase: " + implementToLowerCase(str1))
}

private fun implementToUpperCase(str: String): StringBuilder {
    val result = StringBuilder()
    var ch = ' '
    for (i in str.indices) {
        ch = if (str[i] in 'a'..'z') {
            (str[i].toInt() - 32).toChar()
        } else {
            str[i]
        }
        result.append(ch)
    }
    return result
}

private fun implementToLowerCase(str: String): StringBuilder {
    val result = StringBuilder()
    var ch = ' '
    for (i in str.indices) {
        ch = if (str[i] in 'A'..'Z') {
            (str[i].toInt() + 32).toChar()
        } else {
            str[i]
        }
        result.append(ch)
    }
    return result
}