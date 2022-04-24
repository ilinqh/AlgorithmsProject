package hard

class _41FirstMissingPositive {
    class Solution {
        fun firstMissingPositive(nums: IntArray): Int {
            val n = nums.size
            for (i in nums.indices) {
                if (nums[i] <= 0) {
                    nums[i] = n + 1
                }
            }
            for (i in nums.indices) {
                val num = Math.abs(nums[i])
                if (num <= n) {
                    nums[num - 1] = -Math.abs(nums[num - 1])
                }
            }
            for (i in nums.indices) {
                if (nums[i] > 0) {
                    return i + 1
                }
            }
            return n + 1
        }
    }
}