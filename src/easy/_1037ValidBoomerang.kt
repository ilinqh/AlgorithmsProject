package easy

class _1037ValidBoomerang {
    class Solution {
        fun isBoomerang(points: Array<IntArray>): Boolean {
            val v1 = intArrayOf(points[1][0] - points[0][0], points[1][1] - points[0][1])
            val v2 = intArrayOf(points[2][0] - points[0][0], points[2][1] - points[0][1])
            return v1[0] * v2[1] - v1[1] * v2[0] != 0
        }
    }
}