package medium

class _318MaximumProductOfWordLengths {
    class Solution {
        fun maxProduct(words: Array<String>): Int {
            val n = words.size
            var idx = 0
            val masks = IntArray(n)
            for (w in words) {
                var t = 0
                for (i in w.indices) {
                    val u = w[i] - 'a'
                    t = t or (1 shl u)
                }
                masks[idx] = t
                idx += 1
            }
            var ans = 0
            for (i in 0 until n) {
                for (j in 0 until i) {
                    if ((masks[i] and masks[j]) == 0) {
                        ans = Math.max(ans, words[i].length * words[j].length)
                    }
                }
            }
            return ans
        }
    }
}