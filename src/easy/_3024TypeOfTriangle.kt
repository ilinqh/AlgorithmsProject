package easy

import java.util.Arrays

class _3024TypeOfTriangle {
    class Solution {
        fun triangleType(nums: IntArray): String {
            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                return "equilateral"
            }
            Arrays.sort(nums)
            if (nums[0] + nums[1] <= nums[2]) {
                return "none"
            }
            if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
                return "isosceles"
            }
            return "scalene"
        }
    }
}