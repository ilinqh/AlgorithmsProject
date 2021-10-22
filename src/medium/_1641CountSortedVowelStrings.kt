package medium

class _1641CountSortedVowelStrings {
    class Solution {
        fun countVowelStrings(n: Int): Int {
            return (n + 1) * (n + 2) * (n + 3) * (n + 4) / 24
        }
    }
}