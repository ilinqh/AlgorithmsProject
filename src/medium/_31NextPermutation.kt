package medium

class _31NextPermutation {
    class Solution {
        fun nextPermutation(nums: IntArray) {
            var i = nums.size - 2
            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--
            }
            if (i >= 0) {
                var j = nums.size - 1
                while (j >= 0 && nums[i] >= nums[j]) {
                    j--
                }
                swap(nums, i, j)
            }
            reverse(nums, i + 1)
        }

        private fun swap(nums: IntArray, i: Int, j: Int) {
            val temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        }

        private fun reverse(nums: IntArray, start: Int) {
            var left = start
            var right = nums.size - 1
            while (left < right) {
                swap(nums, left, right)
                left++
                right--
            }
        }
    }

    // Best

    class BestSolution {
        fun nextPermutation(nums: IntArray): Unit {
            var needChange = -1
            for (i in nums.size - 1 downTo  1) {
                if (nums[i - 1] < nums[i]) {
                    needChange = i - 1
                    break
                }
            }
            if (needChange == -1) {
                nums.reverse()
                return
            }
            var firstMaxChang = -1
            for (i in nums.size - 1 downTo needChange + 1) {
                if (nums[i] > nums[needChange]) {
                    firstMaxChang = i
                    break
                }
            }
            nums.swap(needChange, firstMaxChang)
            var left = needChange + 1
            var right = nums.size - 1
            while (left < right) {
                nums.swap(left, right)
                left++
                right--
            }

        }

        private fun IntArray.swap(i: Int, j: Int) {
            if (i < 0 || j < 0 || i >= this.size || j >= this.size) {
                return
            }
            val temp = this[i]
            this[i] = this[j]
            this[j] = temp
        }
    }
}