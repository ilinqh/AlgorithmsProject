package easy

class _1446ConsecutiveCharacters {
    class Solution {
        fun maxPower(s: String): Int {
            var ans = 1
            var cnt = 1
            for (i in 1 until s.length) {
                if (s[i] == s[i - 1]) {
                    cnt += 1
                    ans = Math.max(cnt, ans)
                } else {
                    cnt = 1
                }
            }
            return ans
        }
    }
}