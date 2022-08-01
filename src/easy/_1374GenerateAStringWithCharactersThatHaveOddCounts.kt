package easy

class _1374GenerateAStringWithCharactersThatHaveOddCounts {
    class Solution {
        fun generateTheString(n: Int): String {
            val sb = StringBuilder()
            if (n % 2 == 0) {
                for (i in 0 until n - 1) {
                    sb.append('a')
                }
                sb.append('b')
            } else {
                for (i in 0 until n) {
                    sb.append('a')
                }
            }
            return sb.toString()
        }
    }
}