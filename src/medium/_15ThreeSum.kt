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

    class BestSolution {
        fun threeSum(nums: IntArray): List<List<Int>> {
            val n = nums.size
            Arrays.sort(nums)
            val ans: MutableList<List<Int>> = ArrayList()
            // 枚举 a
            for (first in 0 until n) {
                // 需要和上一次枚举的数不相同
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue
                }
                // c 对应的指针初始指向数组的最右端
                var third = n - 1
                val target = -nums[first]
                // 枚举 b
                for (second in first + 1 until n) {
                    // 需要和上一次枚举的数不相同
                    if (second > first + 1 && nums[second] == nums[second - 1]) {
                        continue
                    }
                    // 需要保证 b 的指针在 c 的指针的左侧
                    while (second < third && nums[second] + nums[third] > target) {
                        --third
                    }
                    // 如果指针重合，随着 b 后续的增加
                    // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                    if (second == third) {
                        break
                    }
                    if (nums[second] + nums[third] == target) {
                        val list: MutableList<Int> = ArrayList()
                        list.add(nums[first])
                        list.add(nums[second])
                        list.add(nums[third])
                        ans.add(list)
                    }
                }
            }
            return ans
        }
    }

}