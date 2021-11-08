package medium

class _454FourSumIi {
    class Solution {
        fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
            var ans = 0
            val n = nums1.size
            val map = HashMap<Int, Int>()
            for (i in 0 until n) {
                for (j in 0 until n) {
                    val sum = nums1[i] + nums2[j]
                    map[sum] = map.getOrDefault(nums1[i] + nums2[j], 0) + 1
                }
            }
            for (i in 0 until n) {
                for (j in 0 until n) {
                    val sum = -nums3[i] - nums4[j]
                    if (map.containsKey(sum)) {
                        ans += map[sum]!!
                    }
                }
            }
            return ans
        }
    }
}