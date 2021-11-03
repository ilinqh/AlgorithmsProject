package hard

import java.util.*

class _407TrappingRainWaterIi {
    class Solution {
        fun trapRainWater(heightMap: Array<IntArray>): Int {
            if (heightMap.size <= 2 || heightMap[0].size <= 2) {
                return 0
            }
            val m = heightMap.size
            val n = heightMap[0].size
            val visit = Array(m) { BooleanArray(n) }
            val pq = PriorityQueue<IntArray> { o1, o2 -> o1[1] - o2[1] }

            for (i in 0 until m) {
                for (j in 0 until n) {
                    if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                        pq.offer(intArrayOf(i * n + j, heightMap[i][j]))
                        visit[i][j] = true
                    }
                }
            }
            var res = 0
            val dirs = intArrayOf(-1, 0, 1, 0, -1)
            while (pq.isNotEmpty()) {
                val curr = pq.poll()
                for (k in 0 until 4) {
                    val nx = curr[0] / n + dirs[k]
                }
            }
            return res
        }
    }
}