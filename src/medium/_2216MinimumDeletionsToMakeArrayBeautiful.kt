package medium

class _2216MinimumDeletionsToMakeArrayBeautiful {
    class Solution {
        fun minDeletion(nums: IntArray): Int {
            var result = 0
            var check = true
            val length = nums.size
            for (i in 0 until (length - 1)) {
                if (nums[i] == nums[i + 1] && check) {
                    result += 1
                } else {
                    check = !check
                }
            }
            result += (length - result) % 2
            return result
        }
    }
}