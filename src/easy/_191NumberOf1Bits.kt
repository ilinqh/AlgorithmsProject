package easy

class _191NumberOf1Bits {
    class Solution {
        fun hammingWeight(n: Int): Int {
            var result = 0
            var tempN = n
            while (tempN != 0) {
                tempN = tempN and (tempN - 1)
                result += 1
            }
            return result
        }
    }
}