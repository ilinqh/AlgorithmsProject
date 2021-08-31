package medium

class _1109CorporateFlightBookings {
    class Solution {
        fun corpFlightBookings(bookings: Array<IntArray>, n: Int): IntArray {
            val result = IntArray(n)
            for (i in bookings.indices) {
                val booking = bookings[i]
                result[booking[0] - 1] += booking[2]
                if (booking[1] < n) {
                    result[booking[1]] -= booking[2]
                }
            }
            for (i in 1 until n) {
                result[i] += result[i - 1]
            }
            return result
        }
    }
}