package hard

class _273IntegerToEnglishWords {
    class Solution {
        private var singles = arrayOf("", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")
        private var teens = arrayOf(
            "Ten",
            "Eleven",
            "Twelve",
            "Thirteen",
            "Fourteen",
            "Fifteen",
            "Sixteen",
            "Seventeen",
            "Eighteen",
            "Nineteen"
        )
        private var tens =
            arrayOf("", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")
        private var thousands = arrayOf("", "Thousand", "Million", "Billion")

        fun numberToWords(num: Int): String {
            if (num == 0) {
                return "Zero"
            }
            var tempNum = num
            val sb = StringBuilder()
            var i = 3
            var unit = 1000000000
            while (i >= 0) {
                val curNum = tempNum / unit
                if (curNum != 0) {
                    tempNum -= curNum * unit
                    sb.append(toEnglish(curNum)).append(thousands[i]).append(" ")
                }

                i -= 1
                unit /= 1000
            }
            return sb.toString().trim()
        }

        private fun toEnglish(tempNum: Int): String {
            val curr = StringBuilder()
            var num = tempNum
            val hundred = num / 100
            num %= 100
            if (hundred != 0) {
                curr.append(singles[hundred]).append(" Hundred ")
            }
            val ten = num / 10
            if (ten >= 2) {
                curr.append(tens[ten]).append(" ")
                num %= 10
            }
            if (num in 1..9) {
                curr.append(singles[num]).append(" ")
            } else if (num >= 10) {
                curr.append(teens[num - 10]).append(" ")
            }

            return curr.toString()
        }
    }
}