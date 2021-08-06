package medium

class _3LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        fun lengthOfLongestSubstring(s: String): Int {
            var maxCount = 0
            var curCount = 0
            val array = ArrayList<Char>()
            for (char in s) {
                if (array.contains(char)) {
                    val index = array.indexOf(char)
                    array.removeIf {
                        array.indexOf(it) <= index
                    }
                    curCount = array.size
                }
                array.add(char)
                maxCount = Math.max(maxCount, ++curCount)
            }
            return maxCount
        }
    }

    class BestSolution {
        fun lengthOfLongestSubstring(s: String): Int {
            val map = HashMap<Char, Int>()
            var maxCount = 0
            var start = 0
            for (end in s.indices) {
                if (map.contains(s[end])) {
                    start = Math.max(start, (map[s[end]] ?: 0) + 1)
                }
                maxCount = Math.max(maxCount, (end - start) + 1)
                map[s[end]] = end
            }
            return maxCount
        }
    }
}