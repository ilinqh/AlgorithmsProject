package medium

class _754ReachANumber {
    class Solution {
        fun reachNumber(target: Int): Int {
            var tempTarget = Math.abs(target)
            var k = 0
            while (tempTarget > 0) {
                k += 1
                tempTarget -= k
            }
            return if (tempTarget % 2 == 0) {
                k
            } else {
                k + 1 + k % 2
            }
        }
    }
}