package medium

class _5LongestPalindromicSubstring {
    class Solution {
        fun longestPalindrome(s: String): String {
            if (s.length < 2) {
                return s
            }
            val sb = StringBuffer().append('#')
            for (char in s) {
                sb.append("${char}#")
            }
            val str = sb.toString()

            var maxLeft = 0
            var maxCount = 1
            var left: Int
            var right: Int
            var count: Int
            for (index in str.indices) {
                count = 1
                left = index
                right = index
                while ((left - 1) >= 0 && (right + 1) < str.length && (str[left - 1] == str[right + 1])) {
                    left--
                    right++
                    count += 2
                }
                if (count > maxCount) {
                    maxLeft = left
                    maxCount = count
                }
            }

            return s.substring(maxLeft / 2, (maxLeft + maxCount) / 2)
        }
    }
}