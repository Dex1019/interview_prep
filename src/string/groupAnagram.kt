package string

fun main() {
    val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    print(groupAnagrams(strs))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = hashMapOf<String, MutableList<String>>()
    for (str in strs) {
        val ch = CharArray(26)
        for (i in str) {
            ch[i - 'a']++
        }
        val sb = String(ch)
        map.putIfAbsent(sb, mutableListOf())
        map[sb]?.add(str)
    }
    return map.values.toMutableList()
}