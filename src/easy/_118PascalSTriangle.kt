package easy

class _118PascalSTriangle {
    class Solution {
        fun generate(numRows: Int): List<List<Int>> {
            val result = ArrayList<List<Int>>()
            for (i in 0 until numRows) {
                val row = ArrayList<Int>(i + 1)
                for (j in 0..i) {
                    if (j == 0 || j == i) {
                        row.add(1)
                    } else {
                        row.add(result[i - 1][j - 1] + result[i - 1][j])
                    }
                }
                result.add(row)
            }
            return result
        }
    }
}