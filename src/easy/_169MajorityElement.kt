package easy

class _169MajorityElement {
    class Solution {
        fun majorityElement(nums: IntArray): Int {
            var count = 0
            var ans: Int? = null
            for (i in nums.indices) {
                if (count == 0) {
                    ans = nums[i]
                }
                count += if (nums[i] == ans) {
                    1
                } else {
                    -1
                }
            }
            return ans!!
        }
    }
}