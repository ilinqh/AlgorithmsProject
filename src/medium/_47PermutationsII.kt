package medium

import java.util.*

class _47PermutationsII {
//    class Solution {
//        fun permuteUnique(nums: IntArray): List<List<Int>> {
//            if (nums.isEmpty()) {
//                return emptyList()
//            }
//            val result: MutableList<List<Int>> = ArrayList()
//            val length = nums.size
//            if (length == 1) {
//                result.add(nums.toList())
//                return result
//            }
//            val curList = ArrayList<Int>()
//            val visited = BooleanArray(length)
//            backtrace(result, curList, 0, nums, visited)
//            return result
//        }
//
//        private fun backtrace(
//            result: MutableList<List<Int>>,
//            curList: MutableList<Int>,
//            index: Int,
//            nums: IntArray,
//            visited: BooleanArray
//        ) {
//            if (index == nums.size) {
//                result.add(ArrayList(curList))
//                return
//            }
//            val aMap = HashSet<Int>()
//            for (i in nums.indices) {
//                if (visited[i]) {
//                    continue
//                }
//                if (aMap.contains(nums[i])) {
//                    continue
//                }
//                aMap.add(nums[i])
//                curList.add(nums[i])
//                visited[i] = true
//                backtrace(result, curList, index + 1, nums, visited)
//                curList.removeAt(curList.size - 1)
//                visited[i] = false
//            }
//        }
//    }

    class Solution {
        fun permuteUnique(nums: IntArray): List<List<Int>> {
            if (nums.isEmpty()) {
                return emptyList()
            }
            val result: MutableList<List<Int>> = ArrayList()
            val length = nums.size
            if (length == 1) {
                result.add(nums.toList())
                return result
            }
            val curList = ArrayList<Int>()
            val visited = BooleanArray(length)
            Arrays.sort(nums)
            backtrace(result, curList, 0, nums, visited)
            return result
        }

        private fun backtrace(
            result: MutableList<List<Int>>,
            curList: MutableList<Int>,
            index: Int,
            nums: IntArray,
            visited: BooleanArray
        ) {
            if (index == nums.size) {
                result.add(ArrayList(curList))
                return
            }
            for (i in nums.indices) {
                if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                    continue
                }
                curList.add(nums[i])
                visited[i] = true
                backtrace(result, curList, index + 1, nums, visited)
                curList.removeAt(curList.size - 1)
                visited[i] = false
            }
        }
    }
}