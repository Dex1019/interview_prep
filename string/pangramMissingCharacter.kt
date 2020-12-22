package string

fun main() {
    val str = "The quick brown fox jumps over the lzy do"
    print(findMissingCharacter(str))
}

fun findMissingCharacter(str: String): StringBuilder {
    val arr = BooleanArray(26)
    for (i in str.indices) {
        if (str[i] in 'a'..'z') {
            arr[str[i] - 'a'] = true
        } else if (str[i] in 'A'..'Z') {
            arr[str[i] - 'A'] = true
        }
    }
    val sb = StringBuilder()
    for (i in arr.indices) {
        if (!arr[i]) {
            sb.append((i + 'a'.toInt()).toChar())
        }
    }
    return sb
}