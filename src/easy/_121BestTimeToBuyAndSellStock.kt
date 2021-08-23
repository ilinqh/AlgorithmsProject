package easy

class _121BestTimeToBuyAndSellStock {
    class Solution {
        fun maxProfit(prices: IntArray): Int {
            var max = 0
            var minPrice = Int.MAX_VALUE
            for (i in prices.indices) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i]
                } else if (prices[i] - minPrice > max) {
                    max = prices[i] - minPrice
                }
            }
            return max
        }
    }
}