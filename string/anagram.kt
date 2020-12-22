package string

import java.util.*

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */
fun main(args: Array<String>) {
    val s = "ana&.gram"
    val t = "nag&ar.am"
    //        System.out.println(checkAnagram(s, t));
    println(checkAnagramOptimised(s, t))
}

private fun checkAnagramOptimised(s: String?, t: String?): Boolean {
    if (s == null || t == null) return false
    if (s.length != t.length) return false
    val map = HashMap<Char, Int>()
    val map2 = HashMap<Char, Int>()
    for (i in s.indices) {
        val c = s[i]
        val c2 = t[i]
        map[c] = map.getOrDefault(c, 0) + 1
        map2[c2] = map2.getOrDefault(c2, 0) + 1
    }
    println("map 1:$map")
    println("map 2:$map2")
    return map == map2
}

private fun checkAnagram(s: String, t: String): Boolean {
    val map = HashMap<Char, Int>()
    for (element in s) {
        map[element] = map.getOrDefault(element, 0) + 1
    }
    println("map 1:$map")
    val map2 = HashMap<Char, Int>()
    for (element in t) {
        map2[element] = map2.getOrDefault(element, 0) + 1
    }
    println("map 2:$map2")
    return map == map2
}
