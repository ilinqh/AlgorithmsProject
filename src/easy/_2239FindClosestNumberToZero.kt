package easy

class _2239FindClosestNumberToZero {
    class Solution {
        fun findClosestNumber(nums: IntArray): Int {
            var result = Int.MAX_VALUE
            for (num in nums) {
                if (Math.abs(num) < Math.abs(result)) {
                    result = num
                } else if (Math.abs(num) == Math.abs(result)) {
                    result = Math.max(num, result)
                }
            }
            return result
        }
    }
}