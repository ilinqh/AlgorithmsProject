package easy

class _415AddStrings {
    class Solution {
        fun addStrings(num1: String, num2: String): String {
            val sb = StringBuilder()
            var i = num1.length - 1
            var j = num2.length - 1
            var addOne = 0
            while (i >= 0 || j >= 0 || addOne != 0) {
                val x = if (i >= 0) {
                    num1[i] - '0'
                } else {
                    0
                }
                val y = if (j >= 0) {
                    num2[j] - '0'
                } else {
                    0
                }
                val result = x + y + addOne
                sb.append(result % 10)
                addOne = result / 10
                i -= 1
                j -= 1
            }

            return sb.reverse().toString()
        }
    }
}