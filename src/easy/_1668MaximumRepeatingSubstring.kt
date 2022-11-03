package easy

class _1668MaximumRepeatingSubstring {
    class Solution {
        fun maxRepeating(sequence: String, word: String): Int {
            var ans = 0
            val sLength = sequence.length
            val sb = StringBuilder(word)
            while (sb.length <= sLength && sequence.contains(sb.toString())) {
                sb.append(word)
                ans += 1
            }
            return ans
        }
    }
}