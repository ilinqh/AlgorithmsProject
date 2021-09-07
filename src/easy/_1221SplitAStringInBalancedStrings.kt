package easy

class _1221SplitAStringInBalancedStrings {
    class Solution {
        fun balancedStringSplit(s: String): Int {
            var result = 0
            var start = ' '
            var count = 0
            for (char in s) {
                if (count == 0) {
                    start = char
                }
                if (start == char) {
                    count++
                } else {
                    count--
                    if (count == 0) {
                        result++
                    }
                }
            }
            return result
        }
    }
}
