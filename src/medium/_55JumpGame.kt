package medium

class _55JumpGame {
    class Solution {
        fun canJump(nums: IntArray): Boolean {
            val n = nums.size
            var rightMore = 0
            for (i in nums.indices) {
                if (i <= rightMore) {
                    rightMore = Math.max(rightMore, i + nums[i])
                    if (rightMore >= n - 1) {
                        return true
                    }
                }
            }
            return false
        }
    }
}