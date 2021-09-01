package hard

class _4MedianOfTwoSortedArrays {
    class Solution {
        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            val length1 = nums1.size
            val length2 = nums2.size
            val findNext = (length1 + length2) % 2 == 0
            val middle = (length1 + length2 - 1) / 2
            val first = findNumByIndex(middle, nums1, nums2, length1, length2)
            var halfDelta = 0.0
            if (findNext) {
                val second = findNumByIndex(middle + 1, nums1, nums2, length1, length2)
                halfDelta = (second - first) / 2.0
            }

            return first + halfDelta
        }

        private fun findNumByIndex(index: Int, nums1: IntArray, nums2: IntArray, length1: Int, length2: Int): Double {
            var pointer1 = 0
            var pointer2 = 0
            var answer = 0
            while ((pointer1 + pointer2) <= index) {
                answer = if (pointer1 == length1) {
                    nums2[pointer2++]
                } else if (pointer2 == length2) {
                    nums1[pointer1++]
                } else if (nums1[pointer1] < nums2[pointer2]) {
                    nums1[pointer1++]
                } else {
                    nums2[pointer2++]
                }
            }
            return answer.toDouble()
        }
    }
}