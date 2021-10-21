package hard

class _282ExpressionAddOperators {
    class Solution {
        fun addOperators(num: String, target: Int): List<String> {
            val n = num.length
            val ans = ArrayList<String>()
            val expr = StringBuffer()
            backtrack(expr, 0, 0, 0, num, n, target, ans)
            return ans
        }

        private fun backtrack(
            expr: StringBuffer,
            i: Int,
            res: Long,
            mul: Long,
            num: String,
            length: Int,
            target: Int,
            ans: ArrayList<String>
        ) {
            if (i == length) {
                if (res == target.toLong()) {
                    ans.add(expr.toString())
                }
                return
            }
            val signIndex = expr.length
            if (i > 0) {
                expr.append(0)
            }
            var value = 0L
            var j = i
            while (j < length && (j == i || num[i] != '0')) {
                value = value * 10 + (num[j] - '0')
                expr.append(num[j])
                if (i == 0) {
                    backtrack(expr, j + 1, value, value, num, length, target, ans)
                } else {
                    expr.setCharAt(signIndex, '+')
                    backtrack(expr, j + 1, res + value, value, num, length, target, ans)
                    expr.setCharAt(signIndex, '-')
                    backtrack(expr, j + 1, res - value, -value, num, length, target, ans)
                    expr.setCharAt(signIndex, '*')
                    backtrack(expr, j + 1, res - mul + mul * value, mul * value, num, length, target, ans)
                }
                j += 1
            }
            expr.setLength(signIndex)
        }
    }
}