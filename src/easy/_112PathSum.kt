package easy

import TreeNode

class _112PathSum {
    class Solution {
        private var target: Int = 0
        fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
            if (root == null) {
                return false
            }
            target = targetSum
            return dfs(root, 0)
        }

        private fun dfs(root: TreeNode, lastSum: Int): Boolean {
            if (root.left == null && root.right == null) {
                return (root.`val` + lastSum) == target
            }
            if (root.left != null) {
                val leftHasPathSum = dfs(root.left!!, lastSum + root.`val`)
                if (leftHasPathSum) {
                    return true
                }
            }
            if (root.right != null) {
                val rightHasPathSum = dfs(root.right!!, lastSum + root.`val`)
                if (rightHasPathSum) {
                    return true
                }
            }
            return false
        }
    }

    class BestSolution {
        fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
            if (root == null) {
                return false
            }
            if (root.left == null && root.right == null) {
                return root.`val` == targetSum
            }
            return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
        }
    }
}