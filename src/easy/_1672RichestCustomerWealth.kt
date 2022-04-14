package easy

class _1672RichestCustomerWealth {
    class Solution {
        fun maximumWealth(accounts: Array<IntArray>): Int {
            var ans = 0
            for (i in accounts.indices) {
                var sum = 0
                for (j in accounts[i].indices) {
                    sum += accounts[i][j]
                }
                ans = Math.max(ans, sum)
            }
            return ans
        }
    }
}