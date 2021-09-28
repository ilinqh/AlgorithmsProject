package medium

import java.util.*

class _128LongestConsecutiveSequence {
    class Solution {
        fun longestConsecutive(nums: IntArray): Int {
            if (nums.isEmpty()) {
                return 0
            }
            Arrays.sort(nums)
            var ans = 1
            var longest = 1
            for (i in 1 until nums.size) {
                if (nums[i] == nums[i - 1]) {
                    continue
                }
                if (nums[i] - nums[i - 1] == 1) {
                    longest += 1
                    ans = Math.max(ans, longest)
                } else {
                    longest = 1
                }
            }
            return ans
        }
    }
}