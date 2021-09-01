package hard

import TreeNode

class _124BinaryTreeMaximumPathSum {
    class Solution {
        private var result = Int.MIN_VALUE
        private val dp = ArrayList<Int>()
        fun maxPathSum(root: TreeNode?): Int {
            if (root == null) {
                return -1000
            }
            dfs(root)
            result = Math.max(result, dp[0])
            for (i in 1 until dp.size) {
                if (dp[i - 1] > 0) {
                    dp[i] += dp[i - 1]
                }
                result = Math.max(result, dp[i])
            }
            return result
        }

        private fun dfs(root: TreeNode?) {
            if (root == null) {
                return
            }
            dfs(root.left)
            dp.add(root.`val`)
            dfs(root.right)
        }
    }
}