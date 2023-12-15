package easy

class _2697LexicographicallySmallestPalindrome {
    class Solution {
        fun makeSmallestPalindrome(s: String): String {
            var left = 0
            var right = s.length - 1
            val array = s.toCharArray()
            while (left <= right) {
                if (s[left] != s[right]) {
                    val min = if (s[left] <= s[right]) {
                        s[left]
                    } else {
                        s[right]
                    }
                    array[left] = min
                    array[right] = min
                }
                left += 1
                right -= 1
            }
            return String(array)
        }
    }
}