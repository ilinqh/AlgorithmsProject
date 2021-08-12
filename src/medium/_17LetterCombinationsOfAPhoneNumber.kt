package medium

class _17LetterCombinationsOfAPhoneNumber {
    class Solution {

        lateinit var resultList: List<String>
        lateinit var digits: String

        fun letterCombinations(str: String): List<String> {
            if (str.isEmpty()) {
                return emptyList()
            }
            resultList = ArrayList()
            digits = str

            return resultList
        }

        private fun traversalArray(char: Char) {

        }

        private fun getArrayByChar(char: Char): CharArray {
            when (char) {
                '2' -> return charArrayOf('a', 'b', 'c')
                '3' -> return charArrayOf('d', 'e', 'f')
                '4' -> return charArrayOf('g', 'h', 'i')
                '5' -> return charArrayOf('j', 'k', 'l')
                '6' -> return charArrayOf('m', 'n', 'o')
                '7' -> return charArrayOf('p', 'q', 'r', 's')
                '8' -> return charArrayOf('t', 'u', 'v')
                '9' -> return charArrayOf('w', 'x', 'y', 'z')
            }
            return charArrayOf()
        }
    }
}