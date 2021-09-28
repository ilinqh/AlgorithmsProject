package easy

class _283MoveZeroes {
    class Solution {
        fun moveZeroes(nums: IntArray) {
            for (i in nums.indices) {
                if (nums[i] != 0) {
                    continue
                }
                var j = i + 1
                while (j < nums.size && nums[j] == 0) {
                    j += 1
                }
                if (j < nums.size) {
                    swap(nums, i, j)
                } else {
                    break
                }
            }
        }

        private fun swap(nums: IntArray, i: Int, j: Int) {
            nums[i] = nums[j]
            nums[j] = 0
        }
    }

    class BestSolution {
        fun moveZeroes(nums: IntArray) {
            var zeroCount = 0
            for (i in nums.indices) {
                if (nums[i] == 0) {
                    zeroCount += 1
                    continue
                }
                nums[i - zeroCount] = nums[i]
            }
            while (zeroCount > 0) {
                nums[nums.size - zeroCount] = 0
                zeroCount -= 1
            }
        }
    }
}