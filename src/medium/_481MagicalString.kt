package medium

class _481MagicalString {
    class Solution {
        fun magicalString(n: Int): Int {
            if (n < 4) {
                return 1
            }
            val s = CharArray(n)
            s[0] = '1'
            s[1] = '2'
            s[2] = '2'
            var ans = 1
            var i = 2
            var j = 3
            while (j < n) {
                var size = s[i] - '0'
                val num = 3 - (s[j - 1] - '0')
                while (size > 0 && j < n) {
                    s[j] = '0' + num
                    if (num == 1) {
                        ans += 1
                    }
                    j += 1
                    size -= 1
                }
                i += 1
            }
            return ans
        }
    }
}