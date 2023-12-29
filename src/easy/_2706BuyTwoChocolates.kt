package easy

class _2706BuyTwoChocolates {
    class Solution {
        fun buyChoco(prices: IntArray, money: Int): Int {
            val temp = prices.sortedWith { a, b ->
                a - b
            }
            val delta = money - temp[0] - temp[1]
            if (delta >= 0) {
                return delta
            }
            return money
        }
    }
}