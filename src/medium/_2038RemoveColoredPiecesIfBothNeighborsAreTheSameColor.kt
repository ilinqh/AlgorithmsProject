package medium

class _2038RemoveColoredPiecesIfBothNeighborsAreTheSameColor {
    class Solution {
        fun winnerOfGame(colors: String): Boolean {
            val freq = arrayOf(0, 0)
            var char = 'C'
            var cnt = 0
            for (i in colors.indices) {
                val c = colors[i]
                if (c != char) {
                    cnt = 1
                    char = c
                } else {
                    cnt += 1
                    if (cnt > 2) {
                        freq[c - 'A'] += 1
                    }
                }
            }
            return freq[0] > freq[1]
        }
    }
}
