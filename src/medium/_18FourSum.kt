package medium

import java.util.*

class _18FourSum {

    class Solution {
        fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
            if (nums.size < 4) {
                return emptyList()
            }
            Arrays.sort(nums)
            val result = ArrayList<ArrayList<Int>>()
            for (first in 0 until (nums.size - 3)) {
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue
                }
                for (second in (first + 1) until (nums.size - 2)) {
                    if (second - first > 1 && nums[second] == nums[second - 1]) {
                        continue
                    }
                    var third = second + 1
                    var fourth = nums.size - 1
                    while (third < fourth) {
                        if (third - second > 1 && nums[third] == nums[third - 1]) {
                            third++
                            continue
                        }
                        if (nums.size - fourth > 1 && nums[fourth] == nums[fourth + 1]) {
                            fourth--
                            continue
                        }
                        val sum = nums[first] + nums[second] + nums[third] + nums[fourth]
                        if (sum == target) {
                            result.add(arrayListOf(nums[first], nums[second], nums[third], nums[fourth]))
                            third++
                            fourth--
                        } else if (sum < target) {
                            third++
                        } else {
                            fourth--
                        }
                    }
                }

            }
            return result
        }
    }
}