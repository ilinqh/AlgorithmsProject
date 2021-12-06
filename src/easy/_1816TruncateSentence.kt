package easy

class _1816TruncateSentence {
    class Solution {
        fun truncateSentence(s: String, k: Int): String {
            val sb = StringBuilder()
            var tempK = k
            for (i in s.indices) {
                if (s[i] == ' ') {
                    if (tempK == 1) {
                        break
                    } else {
                        tempK -= 1
                    }
                }
                sb.append(s[i])
            }
            return sb.toString()
        }
    }
}