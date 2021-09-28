package easy

class _171ExcelSheetColumnNumber {
    class Solution {
        fun titleToNumber(columnTitle: String): Int {
            var ans = 0
            for (index in columnTitle.indices) {
                val ch = columnTitle[index]
                ans = ans * 26 + (ch - '@')
            }
            return ans
        }
    }
}