package easy

class _504Base7 {
    class Solution {
        fun convertToBase7(num: Int): String {
            if (num == 0) {
                return "0"
            }
            val negative = num < 0
            var tempNum = Math.abs(num)
            val sb = StringBuilder()
            while (tempNum > 0) {
                sb.append(tempNum % 7)
                tempNum /= 7
            }
            if (negative) {
                sb.append('-')
            }
            return sb.reverse().toString()
        }
    }
}