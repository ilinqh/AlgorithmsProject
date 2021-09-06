package medium

class _49GroupAnagrams {
    class Solution {
        fun groupAnagrams(strs: Array<String>): List<List<String>> {
            val map = HashMap<String, ArrayList<String>>()
            val sb = StringBuffer()
            for (str in strs) {
                val counts = IntArray(26)
                for (i in str.indices) {
                    counts[str[i] - 'a']++
                }
                for (i in 0 until 26) {
                    if (counts[i] != 0) {
                        sb.append('a' + i).append(counts[i])
                    }
                }
                val key = sb.toString()
                val list = map.getOrDefault(key, ArrayList())
                list.add(str)
                map[key] = list
                sb.delete(0, sb.length)
            }
            return ArrayList<List<String>>(map.values)
        }
    }
}