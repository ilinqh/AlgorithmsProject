package medium

class _227BasicCalculatorIi {
    class Solution {
        fun calculate(s: String): Int {
            val stack = ArrayDeque<Int>()
            var num = 0
            var preSign = '+'
            val n = s.length
            for (i in 0 until n) {
                if (s[i].isDigit()) {
                    num = s[i] - '0' + num * 10
                }
                if (!s[i].isDigit() && s[i] != ' ' || i == n - 1) {
                    when (preSign) {
                        '-' -> {
                            stack.addLast(-num)
                        }
                        '*' -> {
                            stack.addLast(stack.removeLast() * num)
                        }
                        '/' -> {
                            stack.addLast(stack.removeLast() / num)
                        }
                        else -> {
                            stack.addLast(num)
                        }
                    }
                    num = 0
                    preSign = s[i]
                }
            }
            var ans = 0
            while (stack.isNotEmpty()) {
                ans += stack.removeLast()
            }
            return ans
        }
    }
}