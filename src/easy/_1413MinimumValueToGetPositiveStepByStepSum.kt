package easy

class _1413MinimumValueToGetPositiveStepByStepSum {
    class Solution {
        fun minStartValue(nums: IntArray): Int {
            var ans = 0
            var sum = 0
            for (num in nums) {
                sum += num
                ans = Math.min(ans, sum)
            }
            return 1 - ans
        }
    }
}