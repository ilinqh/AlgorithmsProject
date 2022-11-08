package easy

class _1684CountTheNumberOfConsistentStrings {
    class Solution {
        fun countConsistentStrings(allowed: String, words: Array<String>): Int {
            var mask = 0
            for (i in allowed.indices) {
                mask = mask or (1 shl (allowed[i] - 'a'))
            }
            var ans = 0
            for (i in words.indices) {
                var tempMask = 0
                for (j in words[i].indices) {
                    tempMask = tempMask or (1 shl (words[i][j] - 'a'))
                }
                if ((mask or tempMask) == mask) {
                    ans += 1
                }
            }
            return ans
        }
    }
}