package medium

class _43MultiplyStrings {
    class Solution {
        fun multiply(num1: String, num2: String): String {
            if (num1 == "0" || num2 == "0") {
                return "0"
            }
            return ""
        }
    }
    class BestSolution {
        fun multiply(num1: String, num2: String): String {
            if (num1 == "0" || num2 == "0") {
                return "0"
            }
            val m = num1.length
            val n = num2.length
            val ansArr = IntArray(m + n)
            for (i in m - 1 downTo 0) {
                val x = num1[i] - '0'
                for (j in n - 1 downTo 0) {
                    val y = num2[j] - '0'
                    ansArr[i + j + 1] += x * y
                }
            }
            for (i in m + n - 1 downTo 1) {
                ansArr[i - 1] += ansArr[i] / 10
                ansArr[i] %= 10
            }
            var index = if (ansArr[0] == 0) 1 else 0
            val ans = StringBuffer()
            while (index < m + n) {
                ans.append(ansArr[index])
                index++
            }
            return ans.toString()
        }
    }
}