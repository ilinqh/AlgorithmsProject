package easy

class _387FirstUniqueCharacterInAString {
    class Solution {
        fun firstUniqChar(s: String): Int {
            val array = IntArray(26)
            for (i in s.indices) {
                val char = s[i]
                array[char - 'a'] += 1
            }
            for (i in s.indices) {
                val char = s[i]
                if (array[char - 'a'] == 1) {
                    return i
                }
            }
            return -1
        }
    }
}