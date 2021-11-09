package medium

class _150EvaluateReversePolishNotation {
class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<Int>()
        for (i in tokens.indices) {
            val item = tokens[i]
            if (isNumber(item)) {
                stack.add(item.toInt())
            } else {
                val num1 = stack.removeLast()
                val num2 = stack.removeLast()
                when (item) {
                    "+" -> stack.add(num2 + num1)
                    "-" -> stack.add(num2 - num1)
                    "*" -> stack.add(num2 * num1)
                    "/" -> stack.add(num2 / num1)
                    else -> {
                    }
                }
            }
        }
        return stack.removeLast()
    }

    private fun isNumber(str: String): Boolean {
        return !("+" == str || "-" == str || "*" == str || "/" == str)
    }
}
}