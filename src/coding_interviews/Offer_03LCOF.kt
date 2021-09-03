package coding_interviews

import java.util.*

class Offer_03LCOF {
    class Solution {
        fun findRepeatNumber(nums: IntArray): Int {
            Arrays.sort(nums)
            for (i in 0 until nums.size - 1) {
                if (nums[i] == nums[i + 1]) {
                    return nums[i]
                }
            }
            return 0
        }
    }
}