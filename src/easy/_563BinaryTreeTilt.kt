package easy

import TreeNode

class _563BinaryTreeTilt {
    class Solution {
        private var ans = 0
        fun findTilt(root: TreeNode?): Int {
            dfs(root)
            return ans
        }

        private fun dfs(root: TreeNode?): Int {
            if (root == null) {
                return 0
            }
            val sumLeft = dfs(root.left)
            val sumRight = dfs(root.right)
            ans += Math.abs(sumLeft - sumRight)
            return root.`val` + sumLeft + sumRight
        }
    }
}