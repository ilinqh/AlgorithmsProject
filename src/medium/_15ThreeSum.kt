package medium

import java.util.*

class _15ThreeSum {
    /**
     * 直接三重循环的话，会超时
     * 优化-> 先对数组进行排序，然后结合双指针减少遍历次数
     */
    class Solution {
        fun threeSum(nums: IntArray): List<List<Int>> {
            if (nums.size < 3) {
                return emptyList()
            }
            Arrays.sort(nums)
            var secondPointIndex: Int
            var thirdPointIndex: Int
            val result = ArrayList<ArrayList<Int>>()
            for (x in nums.indices) {
                if (x > 0 && nums[x] == nums[x - 1]) {
                    continue
                }
                secondPointIndex = x + 1
                thirdPointIndex = nums.size - 1
                if (secondPointIndex >= thirdPointIndex) {
                    break
                }
                while (secondPointIndex < thirdPointIndex && nums[secondPointIndex] + nums[thirdPointIndex] + nums[x] < 0) {
                    secondPointIndex++
                }
                for (y in secondPointIndex until nums.size) {
                    if ((y - secondPointIndex) > 0 && nums[y] == nums[y - 1]) {
                        continue
                    }
                    while (thirdPointIndex > y && nums[thirdPointIndex] + nums[y] > -nums[x]) {
                        thirdPointIndex--
                    }
                    if (thirdPointIndex != y && nums[thirdPointIndex] + nums[y] + nums[x] == 0) {
                        result.add(arrayListOf(nums[x], nums[y], nums[thirdPointIndex]))
                    }
                }
            }
            return result
        }
    }
}