package medium

import java.util.*

class _388LongestAbsoluteFilePath {
    class Solution {
        fun lengthLongestPath(input: String): Int {
            var ans = 0
            val stack = Stack<String>()
            val array = input.split('\n')
            for (i in array.indices) {
                val item = array[i]
                val tCount = item.count {
                    it == '\t'
                }
                while (stack.size > tCount) {
                    stack.pop()
                }
                stack.push(item.replace("\t", ""))
                if (item.contains('.')) {
                    var tempLength = 0
                    for (j in stack.indices) {
                        tempLength += stack[j].length
                    }
                    tempLength += stack.size - 1
                    ans = Math.max(ans, tempLength)
                }
            }
            return ans
        }
    }
}