package hard

class _32LongestValidParentheses {
    class Solution {
        fun longestValidParentheses(s: String): Int {
            var ans = 0
            val stack = java.util.ArrayDeque<Int>()
            stack.push(-1)
            for (i in s.indices) {
                val ch = s[i]
                if (ch == '(') {
                    stack.push(i)
                } else {
                    stack.pop()
                    if (stack.isEmpty()) {
                        stack.push(i)
                    } else {
                        ans = Math.max(ans, i - stack.peek())
                    }
                }
            }
            return ans
        }
    }
}