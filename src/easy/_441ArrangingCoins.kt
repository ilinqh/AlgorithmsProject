package easy

class _441ArrangingCoins {
    class Solution {
        fun arrangeCoins(n: Int): Int {
            return ((Math.sqrt((8.toLong() * n + 1).toDouble()) - 1) / 2).toInt()
        }
    }

}