package easy

class _350IntersectionOfTwoArraysIi {
    class Solution {
        fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
            val length1 = nums1.size
            val length2 = nums2.size
            if (length1 > length2) {
                return intersect(nums2, nums1)
            }
            val list = arrayListOf<Int>()
            val map = HashMap<Int, Int>()
            for (i in nums1.indices) {
                map[nums1[i]] = map.getOrDefault(nums1[i], 0) + 1
            }
            for (i in nums2.indices) {
                if (map.getOrDefault(nums2[i], 0) > 0) {
                    list.add(nums2[i])
                    map[nums2[i]] = map[nums2[i]]!! - 1
                }
            }
            return list.toIntArray()
        }
    }
}