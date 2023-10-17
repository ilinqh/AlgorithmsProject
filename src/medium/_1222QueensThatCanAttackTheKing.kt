package medium

class _1222QueensThatCanAttackTheKing {
    class Solution {
        fun queensAttacktheKing(queens: Array<IntArray>, king: IntArray): List<List<Int>> {
            val map = HashMap<Int, IntArray>()
            val kx = king[0]
            val ky = king[1]
            for (queen in queens) {
                val qx = queen[0]
                val qy = queen[1]
                val x = qx - kx
                val y = qy - ky
                if (x == 0 || y == 0 || Math.abs(x) == Math.abs(y)) {
                    val dx = sgn(x)
                    val dy = sgn(y)
                    val key = dx * 10 + dy
                    if (!map.contains(key) || map[key]!![2] > (Math.abs(x) + Math.abs(y))) {
                        map[key] = intArrayOf(queen[0], queen[1], Math.abs(x) + Math.abs(y))
                    }
                }
            }

            val result = ArrayList<List<Int>>()
            for (item in map) {
                result.add(listOf(item.value[0], item.value[1]))
            }
            return result
        }

        private fun sgn(x: Int): Int {
            return if (x > 0) {
                1
            } else if (x == 0) {
                0
            } else {
                -1
            }
        }
    }
}