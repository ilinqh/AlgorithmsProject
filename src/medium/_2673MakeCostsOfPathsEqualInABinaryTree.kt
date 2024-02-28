package medium

class _2673MakeCostsOfPathsEqualInABinaryTree {
    class Solution {
        fun minIncrements(n: Int, cost: IntArray): Int {
            var ans = 0
            for (i in n - 2 downTo 1 step 2) {
                ans += Math.abs(cost[i] - cost[i + 1])
                cost[i / 2] += Math.max(cost[i], cost[i + 1])
            }
            return ans
        }
    }
}