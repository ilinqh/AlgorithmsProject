package easy

class _942DiStringMatch {
    class Solution {
        fun diStringMatch(s: String): IntArray {
            val n = s.length
            var lo = 0
            var ho = n
            val ans = IntArray(n + 1)
            for (i in s.indices) {
                val item = s[i]
                ans[i] = if (item == 'I') {
                    lo++
                } else {
                    ho--
                }
            }
            ans[n] = lo
            return ans
        }
    }
}