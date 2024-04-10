package medium

class _1702MaximumBinaryStringAfterChange {
    class Solution {
        fun maximumBinaryString(binary: String): String {
            val n = binary.length
            val zeroIndex = binary.indexOf('0')
            if (zeroIndex < 0) {
                return binary
            }
            val sb = StringBuilder()
            var zeroCount = 0
            for (ch in binary) {
                if (ch == '0') {
                    zeroCount += 1
                }
                sb.append('1')
            }
            sb[zeroIndex + zeroCount - 1] = '0'
            return sb.toString()
        }
    }
}