package medium

class _334IncreasingTripletSubsequence {
    class Solution {
        fun increasingTriplet(nums: IntArray): Boolean {
            var small = Int.MAX_VALUE
            var middle = Int.MAX_VALUE
            for (i in nums.indices) {
                val num = nums[i]
                if (num <= small) {
                    small = num
                } else if (num <= middle) {
                    middle = num
                } else {
                    return true
                }
            }
            return false
        }
    }
}