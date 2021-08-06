package medium

class _6ZigZagConversion {
    class Solution {
        fun convert(s: String, numRows: Int): String {
            if (numRows == 1) {
                return s
            }
            val length = s.length
            val maxModule = Math.ceil(length / (2.0 * (numRows - 1))).toInt()
            val moduleCount = (numRows - 1) * 2
            val sb = StringBuffer()
            for (row in 0 until numRows) {
                val step = (numRows - row - 1) * 2
                for (module in 0 until maxModule) {
                    if ((module * moduleCount + row) < length) {
                        sb.append(s[module * moduleCount + row])
                        if (step in 1 until moduleCount && (module * moduleCount + row + step) < length) {
                            sb.append(s[module * moduleCount + row + step])
                        }
                    }
                }
            }
            return sb.toString()
        }
    }
}