package medium

class _17LetterCombinationsOfAPhoneNumber {
class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) {
            return emptyList()
        }
        val sb = StringBuffer()
        val resultList: ArrayList<String> = ArrayList()
        backtrack(resultList, digits, 0, sb)
        return resultList
    }

    private fun backtrack(resultList: ArrayList<String>, digits: String, index: Int, sb: StringBuffer) {
        if (index == digits.length) {
            resultList.add(sb.toString())
            return
        }
        val array = getArrayByChar(digits[index])
        for (char in array) {
            sb.append(char)
            backtrack(resultList, digits, index + 1, sb)
            sb.delete(index, sb.length)
        }
    }

    private fun getArrayByChar(char: Char): String {
        when (char) {
            '2' -> return "abc"
            '3' -> return "def"
            '4' -> return "ghi"
            '5' -> return "jkl"
            '6' -> return "mno"
            '7' -> return "pqrs"
            '8' -> return "tuv"
            '9' -> return "wxyz"
        }
        return ""
    }
}

    class BestSolution {
        fun letterCombinations(digits: String): List<String> {
            val str = arrayOf("abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
            var list = mutableListOf<String>()
            for (element in digits) {
                list = traceback(str[(element - 2).toString().toInt()], list)
            }
            return list
        }

        private fun traceback(str: String, list: List<String>): MutableList<String> {
            val lists = mutableListOf<String>()
            if (list.isNotEmpty()) {
                for (i in list) {
                    for (j in str) {
                        lists.add(i + j)
                    }
                }
            } else {
                for (element in str) {
                    lists.add(element.toString())
                }
            }
            return lists
        }
    }
}