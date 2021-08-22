package medium

class _789EscapeTheGhosts {
    class Solution {
        fun escapeGhosts(ghosts: Array<IntArray>, target: IntArray): Boolean {
            val distance = manhattanDistance(intArrayOf(0, 0), target)
            for (ghost in ghosts) {
                val ghostDistance = manhattanDistance(ghost, target)
                if (ghostDistance <= distance) {
                    return false
                }
            }
            return true
        }

        private fun manhattanDistance(point1: IntArray, point2: IntArray): Int {
            return Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1])
        }
    }
}