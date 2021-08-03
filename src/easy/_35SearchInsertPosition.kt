package easy

class _35SearchInsertPosition {
    class Solution {
        private lateinit var numArray: IntArray
        fun searchInsert(nums: IntArray, target: Int): Int {
            numArray = nums
            return foundIndex(0, numArray.size - 1, target)
        }

        private fun foundIndex(start: Int, end: Int, target: Int): Int {
            if (start > end) {
                return start
            }
            if (target <= numArray[start]) {
                return start
            }
            if (target > numArray[end]) {
                return end + 1
            }
            val middle = start + (end - start) / 2
            return if (numArray[middle] < target) {
                foundIndex(middle + 1, end, target)
            } else {
                foundIndex(start, middle, target)
            }
        }
    }
}