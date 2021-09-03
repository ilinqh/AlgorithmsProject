package medium

class _45JumpGameII {
    class Solution {
        fun jump(nums: IntArray): Int {
            val length = nums.size
            var end = 0
            var step = 0
            var maxPosition = 0
            for (i in 0 until (length - 1)) {
                maxPosition = Math.max(maxPosition, i + nums[i])
                if (i == end) {
                    end = maxPosition
                    step++
                }
            }
            return step
        }
    }
}