package medium

class _201BitwiseAndOfNumbersRange {
    class Solution {
        fun rangeBitwiseAnd(left: Int, right: Int): Int {
            var shift = 0
            var tempLeft = left
            var tempRight = right
            while (tempLeft < tempRight) {
                tempLeft = tempLeft shr 1
                tempRight = tempRight shr 1
                shift += 1
            }
            return tempLeft shl shift
        }
    }
}