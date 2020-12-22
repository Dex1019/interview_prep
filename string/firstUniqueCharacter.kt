package string

import java.util.*

/**
 * 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */

fun main(args: Array<String>) {
    val str = "loveleetcode"
    println(firstUniqueCharacter(str))
}

fun firstUniqueCharacter(str: String): Int {
    val map = HashMap<Char, Int?>()
    for (i in str.indices) {
        if (map.containsKey(str[i])) {
            map[str[i]] = map[str[i]]!! + 1
        } else {
            map[str[i]] = 1
        }
    }
    println(map)
    for (i in str.indices) {
        if (map[str[i]] == 1) {
            return i
        }
    }
    return -1
}