package easy

class _747LargestNumberAtLeastTwiceOfOthers {
    class Solution {
        fun dominantIndex(nums: IntArray): Int {
            if (nums.size == 1) {
                return 0
            }
            var result = -1
            var first = 0
            var second = 0
            for (i in nums.indices) {
                val item = nums[i]
                if (item >= first) {
                    second = first
                    first = item
                    result = i
                } else if (item >= second) {
                    second = item
                }
            }
            return if (first >= second * 2) {
                result
            } else {
                -1
            }
        }
    }
}