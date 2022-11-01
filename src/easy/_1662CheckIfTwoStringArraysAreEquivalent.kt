package easy

class _1662CheckIfTwoStringArraysAreEquivalent {
    class Solution {
        fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
            val length1 = word1.size
            val length2 = word2.size
            var p = 0
            var q = 0
            var i = 0
            var j = 0
            while (p < length1 && q < length2) {
                if (word1[p][i] != word2[q][j]) {
                    return false
                }
                i += 1
                if (i == word1[p].length) {
                    p += 1
                    i = 0
                }
                j += 1
                if (j == word2[q].length) {
                    q += 1
                    j = 0
                }
            }
            return p == length1 && q == length2
        }
    }
}