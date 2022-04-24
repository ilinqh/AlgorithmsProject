package easy

class _868BinaryGap {
    class Solution {
        fun binaryGap(n: Int): Int {
            var ans = 0
            var tempN = n
            var last = -1
            var i = 0
            while (tempN != 0) {
                if ((tempN and 1) == 1) {
                    if (last != -1) {
                        ans = Math.max(ans, Math.abs(i - last))
                    }
                    last = i
                }
                tempN = tempN shr 1
                i += 1
            }
            return ans
        }
    }
}