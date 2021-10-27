package hard

class _301RemoveInvalidParentheses {
    class Solution {
        private val res = ArrayList<String>()
        fun removeInvalidParentheses(s: String): List<String> {
            var leftRemove = 0
            var rightRemove = 0
            for (i in s.indices) {
                if (s[i] == '(') {
                    leftRemove += 1
                } else if (s[i] == ')') {
                    if (leftRemove == 0) {
                        rightRemove += 1
                    } else {
                        leftRemove -= 1
                    }
                }
            }
            helper(s, 0, 0, 0, leftRemove, rightRemove)
            return res
        }

        private fun helper(
            str: String,
            start: Int,
            leftCount: Int,
            rightCount: Int,
            leftRemove: Int,
            rightRemove: Int
        ) {
            if (leftRemove == 0 && rightRemove == 0) {
                if (isValid(str)) {
                    res.add(str)
                }
                return
            }
            var tempLeftCount = leftCount
            var tempRightCount = rightCount
            for (i in start until str.length) {
                if (i != start && str[i] == str[i - 1]) {
                    continue
                }
                if (leftRemove + rightRemove > str.length - i) {
                    return
                }
                if (leftRemove > 0 && str[i] == '(') {
                    helper(
                        str.substring(0, i) + str.substring(i + 1),
                        i,
                        tempLeftCount,
                        tempRightCount,
                        leftRemove - 1,
                        rightRemove
                    )
                }
                if (rightRemove > 0 && str[i] == ')') {
                    helper(
                        str.substring(0, i) + str.substring(i + 1),
                        i,
                        tempLeftCount,
                        tempRightCount,
                        leftRemove,
                        rightRemove - 1
                    )
                }
                if (str[i] == '(') {
                    tempLeftCount += 1
                } else if (str[i] == '(') {
                    tempRightCount += 1
                }
                if (tempRightCount > tempLeftCount) {
                    break
                }
            }
        }

        private fun isValid(str: String): Boolean {
            var cnt = 0
            for (i in str.indices) {
                if (str[i] == '(') {
                    cnt += 1
                } else if (str[i] == ')') {
                    cnt -= 1
                    if (cnt < 0) {
                        return false
                    }
                }
            }
            return cnt == 0
        }
    }
}