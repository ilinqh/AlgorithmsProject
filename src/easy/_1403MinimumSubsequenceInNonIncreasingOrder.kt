package easy

import java.util.*

class _1403MinimumSubsequenceInNonIncreasingOrder {
    class Solution {
        fun minSubsequence(nums: IntArray): List<Int> {
            val ans = ArrayList<Int>()
            nums.sortDescending()
            var sum = Arrays.stream(nums).sum()
            var newSum = 0
            for (index in nums.indices) {
                if (newSum > sum) {
                    break
                }
                newSum += nums[index]
                sum -= nums[index]
                ans.add(nums[index])
            }
            return ans
        }
    }
}