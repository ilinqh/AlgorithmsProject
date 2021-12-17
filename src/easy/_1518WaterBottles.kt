package easy

class _1518WaterBottles {
    class Solution {
        fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
            return if (numBottles >= numExchange) {
                (numBottles - numExchange) / (numExchange - 1) + 1 + numBottles
            } else {
                numBottles
            }
        }
    }
}