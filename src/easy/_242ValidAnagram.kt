package easy

class _242ValidAnagram {
    class Solution {
        fun isAnagram(s: String, t: String): Boolean {
            val length = s.length
            if (length != t.length) {
                return false
            }
            val sCompress = IntArray(26)
            val tCompress = IntArray(26)
            for (i in 0 until length) {
                sCompress[s[i] - 'a'] += 1
                tCompress[t[i] - 'a'] += 1
            }
            for (i in 0 until 26) {
                if (sCompress[i] != tCompress[i]) {
                    return false
                }
            }
            return true
        }
    }

    class OtherSolution {
        fun isAnagram(s: String, t: String): Boolean {
            val length = s.length
            if (length != t.length) {
                return false
            }
            val sCompress = IntArray(26)
            for (i in 0 until length) {
                sCompress[s[i] - 'a'] += 1
            }
            for (i in 0 until length) {
                val char = t[i]
                sCompress[t[i] - 'a'] -= 1
                if (sCompress[t[i] - 'a'] < 0) {
                    return false
                }
            }
            return true
        }
    }

}