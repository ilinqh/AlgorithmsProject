package medium

import java.util.*

class _1657DetermineIfTwoStringsAreClose {
    class Solution {
        fun closeStrings(word1: String, word2: String): Boolean {
            val array1 = Array(26) {
                0
            }
            val array2 = Array(26) {
                0
            }
            for (ch in word1) {
                array1[ch - 'a'] += 1
            }
            for (ch in word2) {
                array2[ch - 'a'] += 1
            }
            for (i in 0 until 26) {
                if (array1[i] == 0 && array2[i] != 0 || array2[i] == 0 && array1[i] != 0) {
                    return false
                }
            }
            Arrays.sort(array1)
            Arrays.sort(array2)
            return Arrays.equals(array1, array2)
        }
    }
}