package medium

class _799ChampagneTower {
    class Solution {
        fun champagneTower(poured: Int, query_row: Int, query_glass: Int): Double {
            var row = doubleArrayOf(poured.toDouble())
            for (i in 1..query_row) {
                val newRow = DoubleArray(i + 1)
                for (j in 0 until i) {
                    val volumn = row[j] - 1
                    if (volumn > 0) {
                        newRow[j] += volumn / 2
                        newRow[j + 1] += volumn / 2
                    }
                }
                row = newRow
            }
            return Math.min(1.0, row[query_glass])
        }
    }
}