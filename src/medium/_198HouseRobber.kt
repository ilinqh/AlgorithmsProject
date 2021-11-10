package medium

class _198HouseRobber {
    class Solution {
        fun rob(nums: IntArray): Int {
            if (nums.isEmpty()) {
                return 0
            }
            val length = nums.size
            if (length == 1) {
                return nums[0]
            }
            var first = nums[0]
            var second = Math.max(first, nums[1])
            for (i in 2 until length) {
                val temp = second
                second = Math.max(second, first + nums[i])
                first = temp
            }
            return second
        }
    }
}