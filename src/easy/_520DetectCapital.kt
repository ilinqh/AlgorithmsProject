package easy

class _520DetectCapital {
    class Solution {
        fun detectCapitalUse(word: String): Boolean {
            return (word == word.toUpperCase()) || word.substring(1) == word.substring(1).toLowerCase()
        }
    }
}