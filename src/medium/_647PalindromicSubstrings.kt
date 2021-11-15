package medium

class _647PalindromicSubstrings {
    class Solution {
        fun countSubstrings(s: String): Int {
            var length = s.length
            var ans = 0
            val sb = StringBuilder().append('#')
            for (i in 0 until length) {
                sb.append(s[i]).append('#')
            }
            length = sb.length
            for (i in 0 until length) {
                if (sb[i] != '#') {
                    ans += 1
                }
                var left = i - 1
                var right = i + 1
                while (left >= 0 && right < length && sb[left] == sb[right]) {
                    if (sb[left] != '#') {
                        ans += 1
                    }
                    left -= 1
                    right += 1
                }
            }
            return ans
        }
    }
}