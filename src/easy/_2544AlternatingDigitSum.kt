package easy

class _2544AlternatingDigitSum {
    class Solution {
        fun alternateDigitSum(n: Int): Int {
            var result = 0
            var tempN = n
            var last = 1
            while (tempN > 0) {
                val tail = tempN % 10
                result += tail * last
                last *= -1
                tempN /= 10
            }
            if (last == 1) {
                result *= -1
            }
            return result
        }
    }
}