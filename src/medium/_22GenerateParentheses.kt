package medium

class _22GenerateParentheses {
    class Solution {
        fun generateParenthesis(n: Int): List<String> {
            if (n == 0) {
                return emptyList()
            }
            val result = ArrayList<String>()
            val sb = StringBuffer()
            pushParenthesis(result, n, n, n, sb)
            return result
        }

        private fun pushParenthesis(result: ArrayList<String>, length: Int, left: Int, right: Int, sb: StringBuffer) {
            if (left > right) {
                return
            }
            if (left == 0 && right == 0) {
                // 全部放完了
                result.add(sb.toString())
                return
            }
            if (left > 0) {
                sb.append('(')
                pushParenthesis(result, length, left - 1, right, sb)
                sb.delete(2 * length - left - right, sb.length)
            }
            if (right > 0) {
                sb.append(')')
                pushParenthesis(result, length, left, right - 1, sb)
                sb.delete(2 * length - left - right, sb.length)
            }
        }
    }
}