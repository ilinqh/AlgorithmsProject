package easy

class _2073TimeNeededToBuyTickets {
    class Solution {
        fun timeRequiredToBuy(tickets: IntArray, k: Int): Int {
            var result = 0
            val kValue = tickets[k]
            for (i in tickets.indices) {
                result += if (i < k) {
                    Math.min(tickets[i], kValue)
                } else if (i == k) {
                    kValue
                } else {
                    if (tickets[i] < kValue) {
                        tickets[i]
                    } else {
                        kValue - 1
                    }
                }
            }
            return result
        }
    }
}