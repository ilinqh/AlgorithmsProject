package medium

class _397IntegerReplacement {
    class Solution {
        fun integerReplacement(n: Int): Int {
            var ans = 0
            var tempN = n
            while (tempN != 1) {
                if (tempN % 2 == 0) {
                    tempN = tempN shr 1
                    ans += 1
                } else if (tempN % 4 == 1) {
                    tempN = tempN shr 1
                    ans += 2
                } else {
                    if (tempN == 3) {
                        ans += 2
                        tempN = 1
                    } else {
                        tempN = (tempN shr 1) + 1
                        ans += 2
                    }
                }
            }
            return ans
        }
    }
}