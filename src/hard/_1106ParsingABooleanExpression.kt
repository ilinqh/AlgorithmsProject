package hard

import java.util.*

class _1106ParsingABooleanExpression {
    class Solution {
        fun parseBoolExpr(expression: String): Boolean {
            val length = expression.length
            val stack = ArrayDeque<Char>()
            for (i in 0 until length) {
                val ch = expression[i]
                if (ch == ',') {
                    continue
                } else if (ch != ')') {
                    stack.push(expression[i])
                } else {
                    var t = 0
                    var f = 0
                    while (stack.peek() != '(') {
                        val top = stack.pop()
                        if (top == 't') {
                            t += 1
                        } else {
                            f += 1
                        }
                    }
                    stack.pop()
                    val op = stack.pop()
                    when (op) {
                        '!' -> {
                            stack.push(
                                if (f == 1) {
                                    't'
                                } else {
                                    'f'
                                }
                            )
                        }

                        '&' -> {
                            stack.push(
                                if (f == 0) {
                                    't'
                                } else {
                                    'f'
                                }
                            )
                        }

                        '|' -> {
                            stack.push(
                                if (t > 0) {
                                    't'
                                } else {
                                    'f'
                                }
                            )
                        }
                    }
                }
            }
            return stack.pop() == 't'
        }
    }
}