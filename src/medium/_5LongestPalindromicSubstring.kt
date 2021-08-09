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

    // Best

    class BestSolution {
        fun longestPalindrome(s: String): String {
            var start = 0
            var maxLength = 0
            if (s.length < 2) {
                return s
            }

            val chars = s.toCharArray()
            val length = chars.size

            var i = 0
            while (i < length) {
                // 如果剩余长度和小于等于最长子串，就没必要再比较了
                if ((length - i) <= maxLength / 2) {
                    break
                }

                var left = i
                var right = i
                // 第一步 向右寻找相同的字符串
                while (right < length - 1 && chars[right] == chars[right + 1]) {
                    // 继续向右寻找
                    right++
                }
                var goNext = false
                while (right < length - 1 && left > 0 && chars[right + 1] == chars[left - 1]) {
                    right++
                    left--
                    goNext = true
                }
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1
                    start = left
                }
                if (!goNext) {
                    i = right + 1
                } else {
                    i++
                }
            }

            return s.substring(start, start + maxLength)
        }
    }
}