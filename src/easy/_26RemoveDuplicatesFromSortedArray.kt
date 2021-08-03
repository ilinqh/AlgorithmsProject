package easy

class _26RemoveDuplicatesFromSortedArray {
    class Solution {
        fun removeDuplicates(numArray: IntArray): Int {
            if (numArray.isEmpty()) {
                return 0
            }
            var count = 1
            var currentInt = numArray[0]
            for (index in numArray.indices) {
                if (numArray[index] > currentInt) {
                    currentInt = numArray[index]
                    numArray[count] = currentInt
                    count++
                }
            }
            return count
        }
    }

    // Best
    class BestSolution {
        fun removeDuplicates(nums: IntArray): Int {
            var slowIndex = 1
            if (nums.isEmpty()) {
                return 0
            }
            for (i in 1 until nums.size) {
                if (nums[i] != nums[i - 1]) {
                    nums[slowIndex] = nums[i]
                    slowIndex++
                }
            }
            return slowIndex
        }
    }
}
