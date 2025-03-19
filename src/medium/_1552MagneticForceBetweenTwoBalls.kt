package medium

import java.util.*

class _1552MagneticForceBetweenTwoBalls {
    class Solution {
        fun maxDistance(position: IntArray, m: Int): Int {
            var result = -1
            Arrays.sort(position)
            var left = 1
            var right = position[position.size - 1] - position[0]
            while (left <= right) {
                val middle = (left + right) / 2
                if (check(position, m, middle)) {
                    result = middle
                    left = middle + 1
                } else {
                    right = middle - 1
                }
            }
            return result
        }

        private fun check(position: IntArray, m: Int, x: Int): Boolean {
            var pre = position[0]
            var cnt = 1
            for (i in 1 until position.size) {
                if (position[i] - pre >= x) {
                    pre = position[i]
                    cnt += 1
                }
            }
            return cnt >= m
        }
    }
}