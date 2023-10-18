package medium

class _1749MaximumAbsoluteSumOfAnySubarray {
    class Solution {
        fun maxAbsoluteSum(nums: IntArray): Int {
            var positiveMax = 0
            var negativeMin = 0
            var positionSum = 0
            var negativeSum = 0
            for (num in nums) {
                positionSum += num
                positiveMax = Math.max(positiveMax, positionSum)
                positionSum = Math.max(0, positionSum)

                negativeSum += num
                negativeMin = Math.min(negativeMin, negativeSum)
                negativeSum = Math.min(0, negativeSum)
            }

            return Math.max(positiveMax, -negativeMin)
        }
    }
}