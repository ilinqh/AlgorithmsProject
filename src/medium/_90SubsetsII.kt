package medium

import java.util.*

class _90SubsetsII {
    class Solution {
        fun subsetsWithDup(nums: IntArray): List<List<Int>> {
            val result = ArrayList<List<Int>>()
            result.add(emptyList())
            Arrays.sort(nums)
            val item = ArrayList<Int>()
            backtrace(nums, result, item, 0)
            return result
        }

        private fun backtrace(nums: IntArray, result: MutableList<List<Int>>, item: MutableList<Int>, index: Int) {
            if (index == nums.size) {
                return
            }
            for (i in index until nums.size) {
                if (i > index && nums[i] == nums[i - 1]) {
                    continue
                }
                item.add(nums[i])
                result.add(ArrayList(item))
                backtrace(nums, result, item, i + 1)
                item.removeAt(item.size - 1)
            }
        }
    }
}