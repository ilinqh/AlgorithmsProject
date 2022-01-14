package medium

import java.util.*


class _373FindKPairsWithSmallestSums {
    class Solution {
        fun kSmallestPairs(nums1: IntArray, nums2: IntArray, k: Int): List<List<Int>> {
            val pq = PriorityQueue(k) { o1: IntArray, o2: IntArray ->
                nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]]
            }
            val ans = ArrayList<List<Int>>()
            val m = nums1.size
            val n = nums2.size
            for (i in 0 until Math.min(m, k)) {
                pq.offer(intArrayOf(i, 0))
            }
            var tempK = k
            while (tempK > 0 && pq.isNotEmpty()) {
                tempK -= 1
                val idxPair = pq.poll()
                val list = ArrayList<Int>()
                list.add(nums1[idxPair[0]])
                list.add(nums2[idxPair[1]])
                ans.add(list)
                if (idxPair[1] + 1 < n) {
                    pq.offer(intArrayOf(idxPair[0], idxPair[1] + 1))
                }
            }
            return ans
        }
    }
}