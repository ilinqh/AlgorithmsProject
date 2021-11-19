package medium

class _397IntegerReplacement {
    class Solution {
        fun integerReplacement(n: Int): Int {
            var ans = 0
            var tempN = n
            while (tempN != 1) {
                if (tempN % 2 == 0) {
                    tempN = tempN shr 1
                } else {
                    tempN = if (tempN != 3 && ((tempN shr 1) and 1) == 1) {
                        (tempN shr 1) + 1
                    } else {
                        tempN shr 1
                    }
                    ans += 1
                }
                ans += 1
            }
            return ans
        }
    }
}