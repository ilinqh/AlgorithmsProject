package easy

class _520DetectCapital {
    class Solution {
        fun detectCapitalUse(word: String): Boolean {
            return (word == word.uppercase()) || word.substring(1) == word.substring(1).lowercase()
        }
    }
}