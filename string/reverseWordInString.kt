package string

fun main() {
    val str = "  Bob    Loves  Alice   "
    print(reverseWords(str))
}

fun reverseWords(s: String): String {
    val sb = StringBuilder()
    var end = s.length - 1
    while (end >= 0) {
        if (s[end] == ' ') {
            end--
        } else {
            var start = end - 1
            while (start >= 0 && s[start] != ' ') {
                start--
            }
            sb.append(s.substring(start + 1, end + 1))
            sb.append(" ")
            end = start - 1
        }
    }

    if (sb.isNotEmpty()) {
        sb.deleteCharAt(sb.length - 1)
    }

    return sb.toString()
}