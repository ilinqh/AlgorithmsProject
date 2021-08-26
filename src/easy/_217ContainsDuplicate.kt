package easy

import java.util.*

class _217ContainsDuplicate {
    class Solution {
        fun containsDuplicate(nums: IntArray): Boolean {
            Arrays.sort(nums)
            for (i in 0..(nums.size - 2)) {
                if (nums[i] == nums[i + 1]) {
                    return true
                }
            }
            return false
//        val map = HashMap<Int, Int>(nums.size)
//        for (i in nums.indices) {
//            val item = nums[i]
//            if (map.contains(item)) {
//                return true
//            } else {
//                map[item] = i
//            }
//        }
//        return false
        }
    }
}