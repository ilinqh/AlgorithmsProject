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

    class BestSolution {
        fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
            if (nums1.size > nums2.size) {
                return findMedianSortedArrays(nums2, nums1)
            }
            val m = nums1.size
            val n = nums2.size
            var left = 0
            var right = m
            // median1：前一部分的最大值
            // median2：后一部分的最小值
            var median1 = 0
            var median2 = 0
            while (left <= right) {
                // 前一部分包含 nums1[0 .. i-1] 和 nums2[0 .. j-1]
                // 后一部分包含 nums1[i .. m-1] 和 nums2[j .. n-1]
                val i = (left + right) / 2
                val j = (m + n + 1) / 2 - i

                // nums_im1, nums_i, nums_jm1, nums_j 分别表示 nums1[i-1], nums1[i], nums2[j-1], nums2[j]
                val nums_im1 = if (i == 0) Int.MIN_VALUE else nums1[i - 1]
                val nums_i = if (i == m) Int.MAX_VALUE else nums1[i]
                val nums_jm1 = if (j == 0) Int.MIN_VALUE else nums2[j - 1]
                val nums_j = if (j == n) Int.MAX_VALUE else nums2[j]
                if (nums_im1 <= nums_j) {
                    median1 = Math.max(nums_im1, nums_jm1)
                    median2 = Math.min(nums_i, nums_j)
                    left = i + 1
                } else {
                    right = i - 1
                }
            }
            return if ((m + n) % 2 == 0) (median1 + median2) / 2.0 else median1.toDouble()
        }
    }

}