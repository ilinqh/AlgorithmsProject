package easy

class _1154DayOfTheYear {
    class Solution {
        fun dayOfYear(date: String): Int {
            val year = date.substring(0, 4).toInt()
            val month = date.substring(5, 7).toInt()
            val day = date.substring(8, 10).toInt()
            val amount = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
            if (year % 400 == 0 || (year % 4 == 0 && (year % 100 != 0))) {
                amount[1] += 1
            }
            var ans = 0
            for (i in 0 until month - 1) {
                ans += amount[i]
            }
            return ans + day
        }
    }
}