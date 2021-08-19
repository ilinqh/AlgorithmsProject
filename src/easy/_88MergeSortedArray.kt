package easy

class _88MergeSortedArray {
    class Solution {
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
            val totalLength = m + n - 1
            var tempM = m - 1
            var tempN = n - 1
            for (i in totalLength downTo 0) {
                if (tempM < 0) {
                    nums1[i] = nums2[tempN--]
                } else if (tempN < 0) {
                    nums1[i] = nums1[tempM--]
                } else if (nums1[tempM] >= nums2[tempN]) {
                    nums1[i] = nums1[tempM--]
                } else {
                    nums1[i] = nums2[tempN--]
                }
            }
        }
    }

    // Best

    class BestSolution {
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
            var p1 = m - 1
            var p2 = n - 1
            var tail = m + n - 1
            while ((p1 >= 0 || p2 >= 0)) {
                if (p1 == -1) {
                    nums1[tail--] = nums2[p2--]
                } else if (p2 == -1) {
                    nums1[tail--] = nums1[p1--]
                } else if (nums1[p1] >= nums2[p2]) {
                    nums1[tail--] = nums1[p1--]
                } else {
                    nums1[tail--] = nums2[p2--]
                }
            }
        }
    }
}