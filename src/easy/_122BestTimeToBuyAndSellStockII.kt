package easy

class _122BestTimeToBuyAndSellStockII {
    class Solution {
        fun maxProfit(prices: IntArray): Int {
            if (prices.size <= 1) {
                return 0
            }
            var result = 0
            for (i in 1 until prices.size) {
                result += Math.max(0, prices[i] - prices[i - 1])
            }
            return result
        }
    }
}