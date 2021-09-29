package easy

import TreeNode

class _110BalancedBinaryTree {
    class Solution {
        fun isBalanced(root: TreeNode?): Boolean {
            return height(root) >= 0
        }

        private fun height(root: TreeNode?): Int {
            if (root == null) {
                return 0
            }
            val leftHeight = height(root.left)
            val rightHeight = if (leftHeight >= 0) {
                height(root.right)
            } else {
                -1
            }
            return if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
                -1
            } else {
                Math.max(leftHeight, rightHeight) + 1
            }
        }
    }
}