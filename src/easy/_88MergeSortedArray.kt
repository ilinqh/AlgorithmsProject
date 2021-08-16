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
}